package Gun12;

import Utilities.BaseStaticDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class _04_RobotGiris extends BaseStaticDriver {
    public static void main(String[] args) throws AWTException {

        driver.get("https://blog.112dijital.com/web-push-notification-bildirim-kurulumu-detayli-anlatim/");

        Robot rbt = new Robot();

        Bekle(2);

        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);

        Bekle(2);

        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);

        Bekle(2);

        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);

        Bekle(2);

        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);

        Bekle(2);

        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);


        BekleVeKapat();


    }
}
