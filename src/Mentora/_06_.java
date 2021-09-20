package Mentora;

import Utilities.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _06_ extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html");
        Bekle(3);
        Actions myActions = new Actions(driver);

        List<WebElement> cityNames = driver.findElements(By.xpath("//ul[@id='allItems']/child::li"));
        List<WebElement> countryBoxes = driver.findElements(By.xpath("//div[@id='dhtmlgoodies_mainContainer']/child::div"));

        for (WebElement cityName : cityNames) {
            for (WebElement countryBox : countryBoxes) {
                Action myAction = myActions.clickAndHold(cityName).moveToElement(countryBox).release(countryBox).build();
                myAction.perform();
                Bekle(1);

                if (cityName.getCssValue("background-color").equals("rgba(0, 128, 0, 1)"))
                    break;
            }
        }
    }
}
