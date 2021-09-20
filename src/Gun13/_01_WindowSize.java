package Gun13;

import Utilities.BaseStaticDriver;
import org.openqa.selenium.Dimension;

import java.awt.*;
import java.util.Base64;

public class _01_WindowSize extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://www.seleniumeasy.com/test/javascript-alert-box-demo.html");

        driver.manage().window().maximize();//ekrani tam hale getirir.

        //ekrani istedigimiz olculere gore set etme.
        Dimension newSize = new Dimension(800, 600);
        Bekle(3);
        driver.manage().window().setSize(newSize);

        //mevcut windowun sizeini alma.

        Dimension currentSize = driver.manage().window().getSize();
        System.out.println("currentSize.getWidth() = " + currentSize.getWidth());
        System.out.println("currentSize.getHeight() = " + currentSize.getHeight());
        System.out.println("currentSize = " + currentSize);

        driver.quit();

    }
}
