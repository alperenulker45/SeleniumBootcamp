package Gun11;

import Utilities.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_IFrameGiris extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://chercher.tech/practice/frames");

        //Site icinde frame olarak tanimli kisimlar oluyor. Bunlar ayri html sayfalari oluyor. Onlara ulasabilmek
        //icin driveri frame switch etmemiz gerekiyor.

      //driver.switchTo().frame(0);//birinci yontem indexle bulmak.
       driver.switchTo().frame("frame1");//ikinci yontem framein adi veya id si ile bulmak.

       // WebElement elementFrame1 = driver.findElement(By.id("frame1"));
       // driver.switchTo().frame(elementFrame1);

        WebElement input = driver.findElement(By.cssSelector("input[type='text']"));
        input.sendKeys("latviyaaaa");

        driver.quit();

    }
}
