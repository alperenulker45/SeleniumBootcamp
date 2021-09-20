package Mentora;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _2_CheckBox {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/radio.html");

        List<WebElement> checkList = driver.findElements(By.xpath("//input[@type='checkbox']"));

        for (WebElement e : checkList) {
            e.click();
            Thread.sleep(2000);
        }

        driver.quit();
    }
}
