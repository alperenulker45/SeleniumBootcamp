package Mentora;

import Utilities.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _07_ extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://saucelabs.com/");

        driver.findElement(By.id("onetrust-accept-btn-handler")).click();//accept cookies

        WebElement element = driver.findElement(By.id("Email"));

        System.out.println(element.getAttribute("name"));
        System.out.println(element.getAttribute("class"));
        System.out.println(element.getAttribute("type"));

        WebElement btn=driver.findElement(By.id("LblEmail"));

        System.out.println(btn.getCssValue("border"));
        System.out.println(btn.getCssValue("color"));
        System.out.println(btn.getCssValue("font-size"));

        driver.quit();


    }
}
