package Odevler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _01_HS {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\testeralpi\\IdeaProjects\\SeleniumAnlatim\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");
        driver.manage().window().maximize();
        Actions myActions = new Actions(driver);

        List<WebElement> cityList = driver.findElements(By.xpath("//div[@id='answerDiv']//child::div"));
        List<WebElement> countryList = driver.findElements(By.xpath("//div[@class='destinationBox']"));

        for (WebElement webElement : cityList) {
            for (WebElement element : countryList) {
                Action myAction = myActions.clickAndHold(webElement).moveToElement(element).release(element).build();
                myAction.perform();
                if (webElement.getCssValue("background-color").equals("rgba(0, 128, 0, 1)"))
                    break;

            }
        }
        driver.quit();
    }
}
