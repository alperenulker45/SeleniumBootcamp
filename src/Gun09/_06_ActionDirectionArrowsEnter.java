package Gun09;

import Utilities.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _06_ActionDirectionArrowsEnter extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/auto-complete");
        Actions movers = new Actions(driver);

        WebElement txtBox = driver.findElement(By.id("autoCompleteMultipleContainer"));
        Action move = movers
                .moveToElement(txtBox)
                .click()
                .sendKeys("b")
                .build();

        move.perform();

        Bekle(2);

        move = movers.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build();
        move.perform();

        BekleVeKapat();
    }
}
