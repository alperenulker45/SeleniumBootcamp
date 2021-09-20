package Odevler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _02_HS {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\testeralpi\\IdeaProjects\\SeleniumAnlatim\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html");
        driver.manage().window().maximize();

        Actions myActions = new Actions(driver);

        List<WebElement> students = driver.findElements(By.cssSelector("ul[id='allItems']>li"));
        List<WebElement> boxes = driver.findElements(By.cssSelector("ul[id^='box']"));

        for (WebElement e : students) {
            for (WebElement f : boxes) {
                Action myAction = myActions.clickAndHold(e).moveToElement(f).release(f).build();
                myAction.perform();
                Thread.sleep(1000);
            }
        }
        Thread.sleep(2000);

        driver.quit();
    }
}
