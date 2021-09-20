package Gun10;

import Utilities.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_AlertExample extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://demo.guru99.com/test/delete_customer.php");

        WebElement submit = driver.findElement(By.name("submit"));
        submit.click();

        Bekle(2);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        Bekle(2);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();

        BekleVeKapat();


    }
}
