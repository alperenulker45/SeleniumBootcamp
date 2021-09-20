package Mentora;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class _1_{
    public static void main(String[] args) throws InterruptedException {
        /*
    Websitesi : https://demo.opencart.com/
    1) Macbook'un resmine tıkla.
    2) Add to Wishlist'e tıkla.
    3) Açılan yeşil penceredeki wish list'e tıkla.
    4) New Customer'ın altındaki Continue'ya tıkla.
    5)Formu doldur.
    6)Continue buttonuna tıkla.
    7) Your Account Has Been Created! consola yazdırın.
    8) contact us'a tıkla
    9)CONTACT US yazısını konsola yazdır.
     */

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\testeralpi\\Selenium\\Chrome Driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/radio.html");

       /* WebElement radioBtn1 = driver.findElement(By.id("vfb-7-1"));
        radioBtn1.click();

        Thread.sleep(2000);

        WebElement radioBtn2 = driver.findElement(By.cssSelector("input[value='Option 2']"));
        radioBtn2.click();

        Thread.sleep(2000);

        */

        List<WebElement> radioBtns = driver.findElements(By.xpath("//input[@type='radio']"));

        for (WebElement e : radioBtns) {
            e.click();
            Thread.sleep(2000);
        }

        driver.quit();


    }

}
