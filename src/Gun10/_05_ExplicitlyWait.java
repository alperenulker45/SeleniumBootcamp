package Gun10;

import Utilities.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _05_ExplicitlyWait extends BaseStaticDriver {
    public static void main(String[] args) {
        /*
        .titleIs -> title bu olana kadar bekle
        .titleContains -> title ın da bu kelime geçene kadar bekle
        .urlToBe -> url bu olana kadar bekle
        .urlContains -> url de bu kelime geçene kadar bekle
        .visibilityOfElementLocated -> eleman var ve gözükür olana kadar bekle
        .visibilityOfTheElement -> eleman gözükene kadar bekle
        .InvisibilityOfTheElement -> eleman kaybolana kadar bekle
        .elementToBeClickable -> eleman tıklanabilir olana kadra bekle
        .elementToBeSelected -> eleman seçilebilir olana kadra bekle
        .textToBe -> elemanda verilen txt gözükene kadar bekle.
        .alertIsPresent()  -> alert çıkana kadar bekle.
        .visibilityOfAllElementsLocatedBy -> locator ile bütün elemanlari gözükene kadar bekle
        .visibilityOfAllElements -> Verilen elemanların listesindeki tüm elemanlar gözrünür olana kadar bekle
        .numberOfElementsToBe  -> verilen locatora sahip elemanların sayısı bu olana kadar bekle
        .numberOfElementsToBeLessThan -> verilen locatora sahip elemanların sayısı verilenden az olana kadar bekle
        .numberOfElementsToBeMoreThan -> verilen locatora sahip elemanların sayısı verilenden fazla olana kadar bekle
        .presenceOfElementLocated-->verilen locater ekranda gorunene kadar bekle, visibility html de gozukmesi.
         */

        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        WebElement timer = driver.findElement(By.cssSelector("button[onclick='timedText()']"));
        timer.click();

        //WebElement webdriver = driver.findElement(By.xpath("//p[text()='WebDriver']"));
        //imlplicitly waiti 4 sn yaptigimizda bu elemani bulamiyor. Burada sadece bu eleman olusana kadar bekle
        //diyerek elemente ozel bekletme yapacagiz.

        WebDriverWait wait = new WebDriverWait(driver, 15);
        WebElement webDriverTxt = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
        System.out.println(webDriverTxt.getText());

        driver.quit();

    }

}
