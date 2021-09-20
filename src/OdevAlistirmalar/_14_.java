package OdevAlistirmalar;

import Utilities.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _14_ extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

        driver.findElement(By.cssSelector("a[class='at-cv-button at-cv-lightbox-yesno at-cm-no-button']")).click();

        WebElement userMessage = driver.findElement(By.cssSelector("input[id='user-message']"));
        userMessage.sendKeys("mesaj");

        Bekle(2);

        WebElement showMessage = driver.findElement(By.cssSelector("button[type='button'][onclick='showInput();']"));
        showMessage.click();

        Bekle(2);

        WebElement display = driver.findElement(By.cssSelector("span[id='display']"));
        System.out.println(display.getText());

        Bekle(1);

        driver.quit();


    }
}
