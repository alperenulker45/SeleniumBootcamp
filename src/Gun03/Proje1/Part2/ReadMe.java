package Gun03.Proje1.Part2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class ReadMe {

    /*
        1) Bu siteye gidin. -> https://demo.applitools.com/

        2) Username kısmına "ttechno@gmail.com" girin.

        3) Password kısmına "techno123." girin.

        4) "Sign in" buttonunan tıklayınız.

        5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.(Assert kullanın )

        6) URL'in bu olduğunu doğrulayın. -> https://demo.applitools.com/app.html   (Assert kullanın )
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.applitools.com/");

        Thread.sleep(1000);
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("ttechno@gmail.com");

        Thread.sleep(1000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("techno123.");

        Thread.sleep(1000);
        WebElement signIn = driver.findElement(By.linkText("Sign in"));
        signIn.click();


        WebElement yazi = driver.findElement(By.id("time"));
        String yazitxt = yazi.getText();

        Assert.assertEquals("Your nearest branch closes in: 30m 5s", yazitxt);

        String url = driver.getCurrentUrl();
        Assert.assertEquals("https://demo.applitools.com/app.html", url);

        Thread.sleep(2000);
        driver.quit();

    }
}
