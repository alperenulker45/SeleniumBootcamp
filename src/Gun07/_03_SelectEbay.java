package Gun07;

import Utilities.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_SelectEbay extends BaseStaticDriver {
    /*
    Senaryo :
  1- https://www.ebay.com/ sitesini açın
  2- Arama seçim menüsünden 2984  değerli elemanı seçtiriniz. selectByValue
  3- Arama işlemini yaptırınız.

     */

    public static void main(String[] args) {

        driver.get("https://www.ebay.com/");

        WebElement ddMenu = driver.findElement(By.id("gh-cat"));
        driver.manage().deleteAllCookies();

        Select menu = new Select(ddMenu);
        menu.selectByValue("2984");

        Bekle(2);

        WebElement srchBtn = driver.findElement(By.id("gh-btn"));
        srchBtn.click();

        Bekle(3);
        BekleVeKapat();
    }
}
