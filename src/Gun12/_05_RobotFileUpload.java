package Gun12;

import Utilities.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;


public class _05_RobotFileUpload extends BaseStaticDriver {
    public static void main(String[] args) throws AWTException {

        driver.get("http://demo.guru99.com/test/upload/");

      //WebElement dosyaSec = driver.findElement(By.cssSelector("input[type='file']"));
      //dosyaSec.click();
        //invalid argument hatasi veriyor. o bolume clicklemeye izin vermiyor. ayni yeri clickleyen farkli sekilde
        //almamiz gerekiyor.

        WebElement dosyaSec = driver.findElement(By.id("file_wraper0"));
        dosyaSec.click();

        Robot rbt = new Robot();

        // Stringi hafızaya-clipboard a kopyalama kodu
        StringSelection stringSelection = new StringSelection("C:\\Users\\testeralpi\\OneDrive\\Desktop\\ornek.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection , null);
        // Verilen stringi clipboard a set ediyor.


        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_C);

        Bekle(2);

        rbt.keyRelease(KeyEvent.VK_CONTROL);
        rbt.keyRelease(KeyEvent.VK_C);

        Bekle(3);

        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        Bekle(3);

        WebElement file = driver.findElement(By.id("submitbutton"));
        file.click();


        BekleVeKapat();
    }
}
