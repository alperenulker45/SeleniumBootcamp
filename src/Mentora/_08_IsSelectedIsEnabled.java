package Mentora;

import Utilities.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _08_IsSelectedIsEnabled  extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demo.guru99.com/test/radio.html");

        WebElement c1 =driver.findElement(By.xpath("//input[@value='checkbox1']"));

        System.out.println(c1.isSelected());
        System.out.println(c1.isEnabled());
        System.out.println(c1.isDisplayed());

        c1.click();
        System.out.println(c1.isSelected());

        driver.quit();
    }
}
