package Mentora;

import Utilities.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;


public class _4_Deneme extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");

        Actions myActions = new Actions(driver);

        List<WebElement> countryList = driver.findElements(By.xpath("//div[@class='destinationBox']"));
        List<WebElement> ctyList = driver.findElements(By.xpath("//div[@id='answerDiv']//child::div"));

        for (WebElement webElement : ctyList) {
            for (WebElement element : countryList) {
                Action myAction = myActions.clickAndHold(webElement).moveToElement(element).release(element).build();
                myAction.perform();
                Bekle(1);
                if (webElement.getCssValue("background-color").equals("rgba(0, 128, 0, 1)"))
                    break;
            }
        }
        BekleVeKapat();


    }
}
