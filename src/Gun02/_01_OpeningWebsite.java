package Gun02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class _01_OpeningWebsite {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\testeralpi\\Selenium\\Chrome Driver\\chromedriver.exe");
        //hangi browseri kullanacagimizi ve tarayicinin pathini verdik.

        WebDriver driver = new ChromeDriver();
        //kullanacagimiz driver degiskenini tanimladik.

        driver.get("https://www.amazon.com");
        //siteyi actik.

        driver.manage().window().maximize();
        //tarayici penceresini buyuttum.

        Thread.sleep(3000); //3 saniye bekle.. normalde bu kod kullanilmaz. su an ogrenme asamasinda
        //oldugumuz ve bazi seyleri gorebilmek icin bekletiyoruz...
        //normal projelerde kullanilmaz...

        driver.quit();
        //tarayiciyi kapattim.. close() komutu da kullanilabilir. quit komutu acilan tum driverlari kapatir.
        //close ise sadece aktif olani.
    }
}
