package Gun11;

import Utilities.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _04_Ornek extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);
        WebElement input = driver.findElement(By.cssSelector("input[type='text']"));
        input.sendKeys("latviyaaaa");

        //checkbox inner IFRAME'de oldugu icin geri donmuyoruz. icerdeki IFRAME 0 index oluyor yine.
        driver.switchTo().frame(0);
        WebElement checkBox = driver.findElement(By.id("a"));
        checkBox.click();

        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);
        WebElement animalsElemnt = driver.findElement(By.id("animals"));
        Select animals = new Select(animalsElemnt);
        animals.selectByIndex(3);

        driver.quit();

    }

}
