package Gun10;

import Utilities.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_IntroAlert extends BaseStaticDriver {
    public static void main(String[] args) {
        /*
        Interview Sorusu
        - Alertleri nasil kullanirsin?

        cevap : driver.switch().alert() ile kullanilir.

        komutlari :

        accept -> ok, tmm butonuna basmayi saglar
        dismiss -> Cancel, hayir gibi olumsuz olan mesaja basmayi saglar.
        getText -> Alertin mesajini alir
        SendKeys -> prompt (Alertin giris kutusu olan hali), metin gondermeyi saglar.
         */


        driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");

        WebElement clickMe = driver.findElement(By.cssSelector("button[onclick='myAlertFunction()']"));
        clickMe.click();

        driver.switchTo().alert().accept(); // alert butonunda OK, yada Kabule tikladik.

        Bekle(2);
        WebElement click2 = driver.findElement(By.cssSelector("button[onclick='myConfirmFunction()']"));
        click2.click();
        Bekle(2);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss(); // alert uyarisini kabul etmedik. dismiss ettik...

        WebElement txtActual = driver.findElement(By.id("confirm-demo"));
        Assert.assertEquals("You pressed Cancel!", txtActual.getText());

        BekleVeKapat();
    }
}
