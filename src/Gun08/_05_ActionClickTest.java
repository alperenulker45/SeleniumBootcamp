package Gun08;

import Utilities.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _05_ActionClickTest extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://demoqa.com/buttons");
        Bekle(2);

        WebElement clickMeBttn = driver.findElement(By.xpath("//button[text()='Click Me']"));

        //aksiyonlari kullanmak icin new Actions olusturmamiz lazim...

        Actions movers = new Actions(driver);//driver uzerinden aksiyonlari calistirmak icin degisken tanimladik.
        System.out.println("Aksiyon oncesi");
        Bekle(2);

        Action move = movers.moveToElement(clickMeBttn).click().build();//aksiyon hazirlandi ancak henuz tiklanmadi.
        System.out.println("Aksiyon Hazirlandi");
        Bekle(2);

        move.perform();//bu komut verildiginde click yapti..
        System.out.println("Aksiyon Gerceklesti");

        //bunlari daha cok mouse bir yere hareket ettirmemiz gerektiginde kullaniriz. ornegin mouseu bir yere
        //hareket ettirdigimizde menuden secenekler cikacaktir. Onlari gorebilmek icin mouseu oraya move ettirmemiz gerekir
        //Bunu icin moveToElement kullanmamiz gerekir.

        BekleVeKapat();

    }

}
