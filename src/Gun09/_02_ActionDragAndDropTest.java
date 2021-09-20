package Gun09;

import Utilities.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _02_ActionDragAndDropTest extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://demo.guru99.com/test/drag_drop.html");

        WebElement bankBtn = driver.findElement(By.id("credit2"));
        WebElement boxBank = driver.findElement(By.id("bank"));

        Actions movers = new Actions(driver);
        Action move = movers.dragAndDrop(bankBtn, boxBank).build();
        Bekle(2);
        move.perform();

        WebElement afterMove = driver.findElement(By.cssSelector("#bank>li"));

        Assert.assertTrue(afterMove.getText().equals(bankBtn.getText()));


        BekleVeKapat();
    }
}
