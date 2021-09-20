package Gun08;

import Utilities.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_GetAttributeGetCssValue extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.snapdeal.com/");

        //tagin icindeki keylerin degerini almamizi saglar..
        WebElement inputValuEnter= driver.findElement(By.id("inputValEnter"));

        System.out.println(inputValuEnter.getAttribute("name"));
        System.out.println(inputValuEnter.getAttribute("class"));
        System.out.println(inputValuEnter.getAttribute("type"));

        //Elemanin Css yani ekranda gozuken tum ozelliklerini font, renk vs
        System.out.println(inputValuEnter.getCssValue("height"));
        System.out.println(inputValuEnter.getCssValue("font-size"));
        System.out.println(inputValuEnter.getCssValue("color"));
        System.out.println(inputValuEnter.getCssValue("text-overflow"));
        System.out.println(inputValuEnter.getCssValue("border-radius"));
        System.out.println(inputValuEnter.getCssValue("background"));


        BekleVeKapat();
    }

}
