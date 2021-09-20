package OdevAlistirmalar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _08_ {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\testeralpi\\Selenium\\Chrome Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html");
        driver.manage().window().maximize();

        WebElement normSuc = driver.findElement(By.id("normal-btn-success"));
        normSuc.click();

        WebElement x = driver.findElement(By.cssSelector("div[class='alert alert-success alert-normal-success']>button"));
        x.click();

        driver.quit();
    }
}
