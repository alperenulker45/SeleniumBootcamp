package Gun09;

import Utilities.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _03_ActionDragAndDropTest extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://demo.guru99.com/test/drag_drop.html");

        WebElement sales = driver.findElement(By.id("credit1"));
        WebElement account = driver.findElement(By.id("loan"));

        Actions movers = new Actions(driver);
        Action move = movers.clickAndHold(sales).moveToElement(account).release().build();
        Bekle(2);
        move.perform();

        BekleVeKapat();
    }

}
