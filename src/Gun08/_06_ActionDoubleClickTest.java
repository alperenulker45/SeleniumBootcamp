package Gun08;

import Utilities.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _06_ActionDoubleClickTest extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://demoqa.com/buttons");
        Bekle(2);

        WebElement doubleClick = driver.findElement(By.id("doubleClickBtn"));

        Actions movers = new Actions(driver);
        Action move = movers.moveToElement(doubleClick).doubleClick().build();
        move.perform();

        Bekle(2);

        BekleVeKapat();


    }
}
