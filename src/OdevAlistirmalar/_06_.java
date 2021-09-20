package OdevAlistirmalar;

import Utilities.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _06_ extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("https://testpages.herokuapp.com/styled/index.html");


        WebElement fakeAlerts = driver.findElement(By.id("fakealerttest"));
        waitUntClickable(fakeAlerts, 5);
        fakeAlerts.click();

        WebElement showAlert = driver.findElement(By.id("fakealert"));
        waitUntClickable(showAlert, 5);
        clickWithJs(showAlert);

        WebElement okBtn = driver.findElement(By.id("dialog-ok"));
        waitUntClickable(okBtn, 5);
        Bekle(3);
        clickWithJs(okBtn);

        driver.quit();

    }


}
