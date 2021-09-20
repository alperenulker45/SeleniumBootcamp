package Gun08;

import Utilities.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_ElemaninStatusu extends BaseStaticDriver {
    public static void main(String[] args) {

        /*
        Elemanları statüsü

        isSelect();boolean:  checkbox, radiobutton
        isEnabled();boolean
        isDisplay();boolean

        isEnabled()
        Monday : true
        Sunday : false

        isSelect:
        Tuesday : true
        Friday  : false

        isDisplay()
        Monday : true
        Sunday : true
                */

        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        WebElement tuesday = driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-input"));

        System.out.println(tuesday.isDisplayed());
        System.out.println(tuesday.isEnabled());
        System.out.println(tuesday.isSelected());

        Bekle(2);

        tuesday.click();
        System.out.println(tuesday.isSelected());

        BekleVeKapat();

    }
}
