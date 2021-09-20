package OdevAlistirmalar;

import Utilities.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_ extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement findByPl = driver.findElement(By.id("findby"));
        findByPl.click();

        WebElement div1 = driver.findElement(By.id("div1"));
        System.out.println(div1.getText());

        driver.quit();
    }
}
