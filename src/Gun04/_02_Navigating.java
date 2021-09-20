package Gun04;

import Utilities.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Navigating extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.navigate().to("http://www.practiceselenium.com/");//navigate gecmis tutar. get tutmaz.
        WebElement checkOut = driver.findElement(By.linkText("Check Out"));
        checkOut.click();

        Bekle(2);
        driver.navigate().back();//geri git

        Bekle(2);
        driver.navigate().forward();//ileri git

        BekleVeKapat();
    }

}
