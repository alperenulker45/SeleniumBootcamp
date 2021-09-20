package Gun03;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class _02_SendKeysClick {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.practiceselenium.com");

        WebElement link = driver.findElement(By.linkText("Check Out"));
        link.click(); //ekranda buldugu link elemanina tiklayacak...


        Thread.sleep(2000);
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("ulkeralp@gmail.com");//text giris alanina text girecek.

        Thread.sleep(2000);
        WebElement name = driver.findElement(By.id("name"));
        name.sendKeys("alpiero");

        Thread.sleep(2000);
        WebElement adres = driver.findElement(By.id("address"));
        adres.sendKeys("cumhuriyet mah");

        Thread.sleep(2000);
        WebElement placeorder = driver.findElement(By.className("btn-primary"));
        //html kodunda "btn btn-primary" seklinde gozukuyor. bu sekilde art arda ayni sey varsa ikinci tarafi almak gerek

        placeorder.click();

        WebElement menu = driver.findElement(By.id("wsb-element-00000000-0000-0000-0000-000450914921"));
        String menutxt = menu.getText();
        Assert.assertEquals("Menu", menutxt);

        String url = driver.getCurrentUrl();//driverin o anda bulundugu url yi alir.
        Assert.assertEquals("http://www.practiceselenium.com/menu.html?", url);



        Thread.sleep(2000);
        driver.quit();
    }
}
