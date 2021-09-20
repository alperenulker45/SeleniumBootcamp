package Gun12;

import Utilities.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class _06_05_HocaninPage extends BaseStaticDriver {
    public static void main(String[] args) throws AWTException {
        driver.get("http://demo.guru99.com/test/upload/");

//        WebElement dosyaSec=driver.findElement(By.cssSelector("input[type=file]")); //InvalidArgumentException
//        dosyaSec.click(); // bu elemana yapılamayacak hareketi yapıyorsun.

        WebElement dosyaSec = driver.findElement(By.id("file_wraper0"));
        dosyaSec.click();

        // Stringi hafızaya-clipboard a kopyalama kodu
        StringSelection stringSelection = new StringSelection("C:\\Users\\testeralpi\\OneDrive\\Desktop\\ornek.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection , null);
        // Verilen stringi clipboard a set ediyor.

        Robot rbt = new Robot();

        Bekle(4);
        // ctrl+v  : hafızadaki bilgiyi yapıştır
        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_V);

        Bekle(4);

        rbt.keyRelease(KeyEvent.VK_CONTROL);  // tuşları serbest bırak
        rbt.keyRelease(KeyEvent.VK_V); // tuşları serbest bırak

        Bekle(4);
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        Bekle(5);
        WebElement submit = driver.findElement(By.id("submitbutton"));
        submit.click();

        Bekle(5);
        BekleVeKapat();
    }

}
