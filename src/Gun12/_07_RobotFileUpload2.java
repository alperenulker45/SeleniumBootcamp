package Gun12;

import Utilities.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _07_RobotFileUpload2 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://demo.guru99.com/test/upload/");

        WebElement input = driver.findElement(By.id("uploadfile_0"));
        input.sendKeys("C:\\Users\\testeralpi\\OneDrive\\Desktop\\ornek.txt");

        Bekle(2);
        WebElement submit = driver.findElement(By.id("submitbutton"));
        submit.click();

        Bekle(2);

        driver.quit();

    }
}
