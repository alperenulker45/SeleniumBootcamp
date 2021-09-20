package OdevAlistirmalar;

import Utilities.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class _11_ extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");

        Select days = new Select(driver.findElement(By.id("select-demo")));
        List<WebElement> daysList = driver.findElements(By.cssSelector("select[id='select-demo']>option"));
        daysList.remove(0);
        int count =0;
        while (count<5) {
            String str = daysList.get((int) (Math.random() * 7)).getText();
            WebElement wed = driver.
                    findElement(By.cssSelector("select[id='select-demo']>option[value='Wednesday']"));
            if (str.equals(wed.getText())) {
                days.selectByValue(str);
                count++;
            }
            System.out.println(str + " " + wed.getText());
        }
        System.out.println(count);
        driver.quit();
    }
}
