package Gun04;

import Utilities.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _01_FindingElementsByTag extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        //bu bolumde BaseStaticDriver kismindaki static blok otomatik olarak calisiyor ve driveri konumlandiriyor.
        //biz extends ettikten sonra direkt istedigimiz web sayfasina gitme komutuyla basliyoruz.

        driver.get("http://www.practiceselenium.com/");

        List<WebElement> liList = driver.findElements(By.tagName("li"));//burada "find elements" kullandik
        //element degil.. sonunda "s" var... li olan tum tagleri bir listede topladik.

        for (WebElement e : liList) { //li tagi olan sitedeki tum elemanlari yazdirdik...
            System.out.println(e.getText());
        }

        //<a href=""></a>
        //
        //driver.findElements(By.tagName("a"));
        //
        //getText()=""  //sitedeki link olarak etiketlenip texti olmayan elemanlar bu yontemle bulunur.

        Bekle(2);
        Kapat();

    }
}
