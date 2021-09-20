package Gun10;

import Utilities.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class _04_WaitsIntro extends BaseStaticDriver {
    public static void main(String[] args) {
        /*
        Selenium Bekletme Konusu
        Thread.Sleep -> Seleniumun kendisine ait bir kod degil. Genel olarak kodu bekletir. Bu bekleme de kodu durdurur.
                        Kodu durdurmak da iyi birsey degildir.

        implicitly wait :
        tum sayfadaki elemanlar icin bir bekletme suresi ataniyor. Ancak eleman bulundugu anda daha fazla beklemiyor.
        Butun elemanlar icin gecerli. No Such Element hatasi vermek icin verdigimiz sure boyunca elemani bulmak icin
        bekliyor. Bulamazsa exceptionu veriyor.

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         */


        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // bunu koyarak tum elementler icin bunu calistiriyoruz
        // eger bunu koymazsak o element yuklenmeden bulmaya calisacagi icin no such element hatasi verecek.
        // o yuzden bunu her class actigimizda koymamiz gerek.

        WebElement timer = driver.findElement(By.cssSelector("button[onclick='timedText()']"));
        timer.click();

        WebElement webdriver = driver.findElement(By.xpath("//p[text()='WebDriver']"));

        /*
        pageloadtimeout :

           driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
           --> sayfa yuklenene kadar bekle anlamina geliyor. Verdigimiz sure boyunca sayfayi yuklemeye devam ediyor.
           --> sureden once yuklenirse oradan devam ediyor. Verilen sure boyunca yuklenmezse exception veriyor.
           -->
         */

        driver.quit();

    }
}
