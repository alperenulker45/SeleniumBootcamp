package Gun06.ProjeGrupCozumleri;

import Utilities.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class senaryo1 extends BaseStaticDriver  {
    public static void main(String[] args) {

        driver.navigate().to("https://www.saucedemo.com/");

        WebElement username= driver.findElement(By.xpath("//input[@id='user-name']"));
        username.sendKeys("standard_user");

        Bekle(2);

        WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");

        Bekle(2);

        WebElement login= driver.findElement(By.xpath("//input[@id='login-button']"));
        login.click();

        Bekle(2);

        List<WebElement> elementList=driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
        for (WebElement e:elementList) {

            System.out.println(e.getText());

        }


        BekleVeKapat();


    }
}
