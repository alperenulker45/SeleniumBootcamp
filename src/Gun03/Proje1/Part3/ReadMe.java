package Gun03.Proje1.Part3;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadMe {

    /*

        1) Bu siteye gidin. -> https://www.snapdeal.com/

        2) "teddy bear" aratın ve  Search butonuna tıklayın.

        3) Bu yazının göründüğünü doğrulayınız. -> (We've got 918 results for 'teddy bear')
        Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.

        4) Snepdeal logosuna tıklayınız.

        5) URL'in bu olduğunu doğrulayın. (https://www.snapdeal.com/)

     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.snapdeal.com/");

        driver.manage().window().maximize();

        WebElement search= driver.findElement(By.id("inputValEnter"));
        search.sendKeys("teddy bear");

        WebElement button= driver.findElement(By.className("searchTextSpan"));
        button.click();
        Thread.sleep(3000);

        WebElement yazi = driver.findElement(By.id("searchMessageContainer"));
        String checkyazi = yazi.getText();

        Assert.assertEquals("We've got 472 results for 'teddy bear'", checkyazi);
        WebElement logo= driver.findElement(By.className("cur-pointer"));
        logo.click();

        String url= driver.getCurrentUrl();
        Assert.assertEquals("https://www.snapdeal.com/",url);

        Thread.sleep(3000);
        driver.quit();
    }

}
