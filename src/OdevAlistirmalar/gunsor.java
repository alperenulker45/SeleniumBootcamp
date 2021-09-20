package OdevAlistirmalar;

import Utilities.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


public class gunsor extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.youtube.com/");

        WebElement agree = driver.findElement(By.cssSelector("div[class='VfPpkd-RLmnJb"));
        waitUntClickable(agree, 5);
        clickWithJs(agree);

        Bekle(4);
        WebElement search = driver.findElement(By.id("search"));
        search.sendKeys("galatasaray");

        WebElement searchBtn = driver.findElement(By.id("search-icon-legacy"));
        searchBtn.click();

        Bekle(4);
        scrollDownJs(13000);
        Bekle(3);
        scrollDownJs(13000);
        Bekle(3);
        scrollDownJs(13000);

    }

    public static void scrollDownJs (int y) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,"+y+")" );
    }

}
