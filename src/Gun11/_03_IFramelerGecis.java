package Gun11;

import Utilities.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_IFramelerGecis extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://chercher.tech/practice/frames");

        //1. frame gidip o frame icinden webelement bulup icine yazi fonderdik.
        driver.switchTo().frame("frame1");//ikinci yontem framein adi veya id si ile bulmak.
        WebElement input = driver.findElement(By.cssSelector("input[type='text']"));
        input.sendKeys("latviyaaaa");

        //2. IFRAME'e gecis icin mutlaka once ana ekrana donus gerekiyor.

        driver.switchTo().defaultContent();//anasayfaya, yani ilk HTML ye geri don.
       // driver.switchTo().parentFrame();// Bir frame geri gelir. 1 kademe frame gittigimizde ana ekrana geri
        // gelir ama ic ice 2 frame gittigimizde bu kod ana ekrana deil bir onceki IFRAME e gelir.

        //2. frame gec ve oradaki selectin 3. elemanini sec
        driver.switchTo().frame("frame2");
        WebElement animalsElemnt = driver.findElement(By.id("animals"));
        Select animals = new Select(animalsElemnt);
        animals.selectByIndex(2);

        driver.quit();


    }
}
