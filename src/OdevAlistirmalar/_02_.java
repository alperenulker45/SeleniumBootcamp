package OdevAlistirmalar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_ {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\testeralpi\\Selenium\\Chrome Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");

        WebElement alerts = driver.findElement(By.id("alerts"));
        alerts.click();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());

        WebElement basicAjax = driver.findElement(By.id("basicajax"));
        basicAjax.click();
        System.out.println(driver.getCurrentUrl());

        driver.quit();

    }
}
