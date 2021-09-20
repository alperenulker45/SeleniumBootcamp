package Gun13;

import Utilities.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_Soru extends BaseStaticDriver {
    public static void main(String[] args) {
        /*
          Senaryo
          1- https://testsheepnz.github.io/BasicCalculator.html sitesine gidiniz.
          2- random 100 e kadar 2 sayı üretiniz.
          3- Sayıları hesap makinesinin bütün fonksiyonları için çalıştırınız.
          4- Sonuçları Assert ile kontrol ediniz.
          5- Yukarıdaki işlemi 5 kez tekrar ettiriniz.
        */

        driver.get("https://testsheepnz.github.io/BasicCalculator.html");

        for (int i = 0; i < 5; i++) {

            int random1 = (int) (Math.random() * 100);
            int random2 = (int) (Math.random() * 100);

            WebElement firstBox = driver.findElement(By.id("number1Field"));
            firstBox.clear();
            firstBox.sendKeys(String.valueOf(random1));

            WebElement secondBox = driver.findElement(By.id("number2Field"));
            secondBox.clear();
            secondBox.sendKeys(String.valueOf(random2));

            WebElement islem = driver.findElement(By.id("selectOperationDropdown"));
            Select secim = new Select(islem);
            secim.selectByIndex(i);
            driver.findElement(By.id("calculateButton")).click();
            Bekle(2);
            WebElement result = driver.findElement(By.id("numberAnswerField"));
            System.out.println(random1+ " "+ secim.getOptions().get(i).getText() + " " + random2 + " " + result.getAttribute("value"));

            switch (secim.getOptions().get(i).getText()) {

                case "Add":
                    Assert.assertEquals(random1 + random2, Integer.parseInt(result.getAttribute("value")));
                    break;

                case "Subtract":
                    Assert.assertEquals(random1 - random2, Integer.parseInt(result.getAttribute("value")));
                    break;

                case "Multiply":
                    Assert.assertEquals(random1 * random2, Integer.parseInt(result.getAttribute("value")));
                    break;

                case "Divide":
                    Assert.assertEquals((double) random1 / random2, Double.parseDouble(result.getAttribute("value")), 0.09);
                    break;

                case "Concenate" :
                    Assert.assertEquals(random1 +String.valueOf(random2), result.getAttribute("value"));
                    break;
            }
        }

        driver.quit();
    }
}
