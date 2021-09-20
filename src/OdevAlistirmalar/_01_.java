package OdevAlistirmalar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_ {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\testeralpi\\Selenium\\Chrome Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        driver.manage().window().maximize();

        WebElement alert = driver.findElement(By.id("alert"));
        alert.click();

        System.out.println(driver.getCurrentUrl());

        driver.quit();
    }
}
