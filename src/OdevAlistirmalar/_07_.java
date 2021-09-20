package OdevAlistirmalar;

import Utilities.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _07_ extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement fakeAlerts = driver.findElement(By.id("fakealerttest"));
        waitUntClickable(fakeAlerts, 4);
        clickWithJs(fakeAlerts);

        WebElement showModDialog = driver.findElement(By.id("modaldialog"));
        waitUntClickable(showModDialog, 4);
        clickWithJs(showModDialog);


        Bekle(2);
        WebElement dialogOk = driver.findElement(By.id("dialog-ok"));
        waitUntClickable(dialogOk, 4);
        clickWithJs(dialogOk);

        driver.quit();
    }

}
