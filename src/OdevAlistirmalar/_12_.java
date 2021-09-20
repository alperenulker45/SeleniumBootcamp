package OdevAlistirmalar;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class _12_ {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\testeralpi\\Selenium\\Chrome Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

        driver.findElement(By.cssSelector("a[class='at-cv-button at-cv-lightbox-yesno at-cm-no-button']")).click();
        List<WebElement> allExamples = driver.findElements(By
                .cssSelector("li[class='tree-branch']>i[class='tree-indicator glyphicon glyphicon-chevron-right']"));

        allExamples.get(0).click();

        Thread.sleep(1500);

        WebElement ajaxForm = driver.findElement(By
                .cssSelector("li[style='display: list-item;']>a[href='./ajax-form-submit-demo.html']"));

        ajaxForm.click();

        Thread.sleep(1500);

        driver.findElement(By.id("title")).sendKeys("Alperen");
        Thread.sleep(1000);

        driver.findElement(By.id("description")).sendKeys("comment");
        Thread.sleep(1000);

        WebElement sbmtBtn = driver.findElement(By.id("btn-submit"));
        sbmtBtn.click();
        Thread.sleep(1000);

        WebElement sbmtCheck = driver.findElement(By.id("submit-control"));
        System.out.println(sbmtCheck.getText());

        Assert.assertEquals("Form submited Successfully!", sbmtCheck.getText());

        driver.quit();
    }
}
