package Gun09;

import Utilities.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class _07_ActionHoverOverTest extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.etsy.com/");

        WebElement cookieAccept = driver.findElement(By.cssSelector("button[class='wt-btn wt-btn--filled wt-mb-xs-0']"));
        cookieAccept.click();

        Actions movers = new Actions(driver);

        WebElement jewelry = driver.findElement(By.id("catnav-primary-link-10855"));
        WebElement necklase = driver.findElement(By.id("side-nav-category-link-10873"));

        Action move = movers.moveToElement(jewelry).build();
        move.perform();

        Bekle(2);

        move = movers.moveToElement(necklase).build();
        move.perform();

        Bekle(2);

    }
}
