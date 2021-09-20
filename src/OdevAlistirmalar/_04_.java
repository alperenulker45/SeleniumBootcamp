package OdevAlistirmalar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04_ {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\testeralpi\\Selenium\\Chrome Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        driver.manage().window().maximize();

        WebElement search = driver.findElement(By.id("search"));
        search.click();

        WebElement head = driver.findElement(By.cssSelector("body > h1"));
        System.out.println(head.getText());

        WebElement searchBtn = driver.findElement(By.name("btnG"));
        searchBtn.click();

        System.out.println(driver.getCurrentUrl());

        driver.quit();
    }
}
