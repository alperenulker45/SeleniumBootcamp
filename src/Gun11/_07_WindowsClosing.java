package Gun11;

import Utilities.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _07_WindowsClosing extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.selenium.dev/");

        List<WebElement> links = driver.findElements(By.cssSelector("a[target='_blank']"));
        String homePageId = driver.getWindowHandle();

        for (WebElement link : links) {
            link.click();
        }

        Set<String> windowIDs = driver.getWindowHandles();

        for (String ID : windowIDs) {
            if (ID.equals(homePageId)) continue;
            System.out.println("ID = " + ID);
            driver.switchTo().window(ID);
            System.out.println("driver.getTitle() = " + driver.getTitle());
            driver.close();
            Bekle(1);
        }

        // driver en son yukarıdaki kapatılan sayfaya switch olmuştu onu gösteriyordu,
        // eğer alttaki anasayfaya switch eden set eden komut olmasa idi, driver kapatılan sayfayı gösterdiğinden
        // hata verecekti.Bu yüzden en son stiwch işlemini yaparak driver ı ana sayfaya set(switch) ettik
        driver.switchTo().window(homePageId);
        System.out.println(driver.getTitle());

        driver.quit();
    }
}
