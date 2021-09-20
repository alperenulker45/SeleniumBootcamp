package Odevler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _03_AS {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\testeralpi\\Selenium\\Chrome Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html");
        driver.manage().window().maximize();
        Actions myActions = new Actions(driver);

        // WebElement rome = driver.findElement(By.id("node18"));
        // WebElement italy = driver.findElement(By.id("box1"));
        // Action myAction = myActions.clickAndHold(rome).moveToElement(italy).release(italy).build();
        // myAction.perform();
        // System.out.println(rome.getCssValue("background-color"));

        List<WebElement> cities = driver.findElements(By.cssSelector("ul[id='allItems']>li"));
        List<WebElement> boxes = driver.findElements(By.cssSelector("ul[id^='box']"));

        for (WebElement x : cities) {
            for (WebElement y : boxes) {

                Action myAction = myActions.clickAndHold(x).moveToElement(y).release(y).build();

                myAction.perform();

                if (x.getCssValue("background-color").equals("rgba(0, 128, 0, 1)"))
                break;

            }
        }
        Thread.sleep(3000);
        driver.switchTo().alert().accept();

        driver.quit();
    }
}
