package Gun10;

import Utilities.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_AlertSendKeys extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");

        WebElement clickMe = driver.findElement(By.cssSelector("button[onclick='myPromptFunction()']"));
        clickMe.click();

        Bekle(1);
        driver.switchTo().alert().sendKeys("alperen");
        Bekle(2);
        driver.switchTo().alert().accept();
        Bekle(1);
        WebElement testTxt = driver.findElement(By.id("prompt-demo"));

        Assert.assertEquals("You have entered 'alperen' !", testTxt.getText());

        BekleVeKapat();

    }

}
