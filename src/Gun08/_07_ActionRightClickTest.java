package Gun08;

import Utilities.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _07_ActionRightClickTest extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://demoqa.com/buttons");
        Bekle(2);

        WebElement rightClick = driver.findElement(By.id("rightClickBtn"));

        Actions movers = new Actions(driver);
        Action move = movers.moveToElement(rightClick).contextClick().build();
        move.perform();

        Bekle(2);

        BekleVeKapat();
    }
}
