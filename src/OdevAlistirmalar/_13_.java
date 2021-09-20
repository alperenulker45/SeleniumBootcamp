package OdevAlistirmalar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _13_ {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\testeralpi\\Selenium\\Chrome Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        driver.findElement(By.cssSelector("a[class='at-cv-button at-cv-lightbox-yesno at-cm-no-button']")).click();

        WebElement listBox = driver.findElement(By.linkText("List Box"));
        listBox.click();

        Thread.sleep(1000);

        WebElement bootStrapListBox = driver.findElement(By.linkText("Bootstrap List Box"));
        bootStrapListBox.click();

        Thread.sleep(1000);

        WebElement bootstrapDualist = driver.findElement(By
                .cssSelector("div[class='well text-right']>ul[class='list-group']>:nth-child(1)"));
        bootstrapDualist.click();

        Thread.sleep(1000);

        WebElement rghtAr = driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-chevron-right']"));
        rghtAr.click();

        Thread.sleep(1000);

        WebElement dapi = driver.findElement(By
                .cssSelector("div[class='well text-right']>ul[class='list-group']>:nth-child(1)"));
        dapi.click();

        Thread.sleep(1000);

        rghtAr.click();

        Thread.sleep(1000);

        driver.findElement(By.cssSelector("div[class='well']>ul>:nth-child(6)")).click();

        Thread.sleep(1000);

        driver.findElement(By.cssSelector("div[class='well']>ul>:nth-child(7)")).click();

        Thread.sleep(1000);

        driver.findElement(By.cssSelector("div[class='well']>ul>:nth-child(1)")).click();

        Thread.sleep(1000);

        WebElement leftAr = driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-chevron-left']"));
        leftAr.click();

        Thread.sleep(1000);

        driver.findElement(By.cssSelector("div[class='well']>ul>:nth-child(2)")).click();
        leftAr.click();

        Thread.sleep(1000);

        driver.quit();

    }
}
