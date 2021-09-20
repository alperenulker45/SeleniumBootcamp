package Gun12;

import Utilities.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class _03_ScrollToWebElement extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://triplebyte.com/");

        WebElement txt = driver.findElement(By.cssSelector("a[href='/jobs'][class='massive-button']"));
        scrollToElement(txt);


    }

    public static void scrollToElement(WebElement element) {

        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }


}
