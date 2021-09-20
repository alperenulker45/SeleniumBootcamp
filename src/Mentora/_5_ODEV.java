package Mentora;

import Utilities.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _5_ODEV extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");


        Actions myActions = new Actions(driver);

        List<WebElement> cityList = driver.findElements(By.xpath("//div[@id='answerDiv']//child::div"));
        List<WebElement> countryList = driver.findElements(By.xpath("//div[@class='destinationBox']"));

        for (int i = 0; i < cityList.size(); i++) {
            for (int j = 0; j < countryList.size(); j++) {
                Action myAction = myActions.clickAndHold(cityList.get(i)).moveToElement(countryList.get(j)).release(countryList.get(j)).build();
                myAction.perform();
                Bekle(2);
                if (cityList.get(i).getCssValue("background-color").equals("rgba(0, 128, 0, 1)"))
                    break;

            }
        }

        BekleVeKapat();

    }
}
