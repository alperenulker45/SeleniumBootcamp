package Gun06.Proje;


import Utilities.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _1_Senaryo extends BaseStaticDriver {
    public static void main(String[] args) {

        //Senaryo
        //1- https://www.saucedemo.com/ sitesini açınız.
        //2- Login işlemini yapınız
        //3- Burada gözüken ürünlerin isimlerini yazdırınız.
        // Sadece XPath kullanınız.

        driver.get("https://www.saucedemo.com/");

        WebElement usernameInput = driver.findElement(By.xpath("//input[@id='user-name']"));
        usernameInput.sendKeys("standard_user");

        WebElement passwordInput = driver.findElement(By.xpath("//input[@id='password']"));
        passwordInput.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();

        List<WebElement> items = driver.findElements(By.xpath("//*[@class='inventory_item_name']"));

        for (WebElement e : items) {
            System.out.println(e.getText());
        }

        BekleVeKapat();
    }
}
