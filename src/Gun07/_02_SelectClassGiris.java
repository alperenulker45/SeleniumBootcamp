package Gun07;

import Utilities.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_SelectClassGiris extends BaseStaticDriver {
    public static void main(String[] args) {

        /*

     select class ı
     görünen text ile seçim için: selectByVisibleText
     valueden seçim için        : selectByValue
     sırasından seçim için      : selectByIndex


         */

        driver.get("https://www.amazon.com/");

        WebElement ddMenu = driver.findElement(By.id("searchDropdownBox"));

        Bekle(2);
        Select menu = new Select(ddMenu);
        menu.selectByVisibleText("Books");

        Bekle(2);

        WebElement srchBtn = driver.findElement(By.id("nav-search-submit-button"));
        srchBtn.click();

        Bekle(3);

        BekleVeKapat();

    }
}
