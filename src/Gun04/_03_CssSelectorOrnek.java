package Gun04;

import Utilities.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_CssSelectorOrnek extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://www.practiceselenium.com/");

        WebElement element = driver.findElement(By.cssSelector("[class='form-actions'][style='text-align: right'"));
        WebElement element2 = driver.findElement(By.cssSelector("[id='wsb-element-00000000-0000-0000-0000-000450914894']>div>p>span'"));

        System.out.println(element.getText());

        BekleVeKapat();
    }
}
