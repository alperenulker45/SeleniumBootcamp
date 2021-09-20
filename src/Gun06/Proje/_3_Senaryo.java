package Gun06.Proje;

import Utilities.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _3_Senaryo extends BaseStaticDriver {
    public static void main(String[] args) {

        login();

        List<WebElement> itemList = driver.findElements(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']"));

        for (WebElement e : itemList) {
            e.click();
            Bekle(1);
        }

        Bekle(2);
        WebElement box = driver.findElement(By.cssSelector("a[class='shopping_cart_link']"));
        box.click();

        Bekle(2);

        List<WebElement> removeList = driver.findElements(By.xpath("//button[@class='btn btn_secondary btn_small cart_button']"));

        for (WebElement r : removeList) {
            r.click();
            Bekle(1);
        }

        WebElement boxTxt = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        System.out.println(boxTxt.getText() + "item");

        driver.quit();
    }

    public static void login() {
        driver.get("https://www.saucedemo.com/");

        WebElement usernameInput = driver.findElement(By.xpath("//input[@id='user-name']"));
        usernameInput.sendKeys("standard_user");

        WebElement passwordInput = driver.findElement(By.xpath("//input[@id='password']"));
        passwordInput.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();
    }

}
