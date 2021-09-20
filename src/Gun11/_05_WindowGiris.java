package Gun11;

import Utilities.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;

public class _05_WindowGiris extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.selenium.dev/");

        List<WebElement> links = driver.findElements(By.cssSelector("a[target='_blank']"));

        for (WebElement link : links) {
            link.click();
        }

        Set<String> windowIDs = driver.getWindowHandles();

        for (String ID : windowIDs) {
            System.out.println("ID = " + ID);
        }

        driver.quit();
    }
}
