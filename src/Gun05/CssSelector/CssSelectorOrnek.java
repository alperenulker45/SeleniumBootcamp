package Gun05.CssSelector;

import Utilities.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CssSelectorOrnek extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://formsmarts.com/form/yu?mode=h5");

        WebElement business = driver.findElement(By.cssSelector("input[id$='4586_0']"));
        business.click();

        WebElement dropDownDiscover = driver.findElement(By.cssSelector("select[id$='4588']"));
        dropDownDiscover.click();

        WebElement optionOnlineAdvertising = driver.findElement(By.cssSelector("option[value='Online Advertising']"));
        optionOnlineAdvertising.click();

        WebElement buttonEveryDay = driver.findElement(By.cssSelector("input[id$='89585_0']"));
        buttonEveryDay.click();

        WebElement goodRadio = driver.findElement(By.cssSelector("input[id$='4589_0']"));
        goodRadio.click();

        WebElement howLongDropDown = driver.findElement(By.cssSelector("select[id$='4597']"));
        howLongDropDown.click();

        WebElement howLongOp4= driver.findElement(By.cssSelector("select[id$='4597'] > :nth-child(4)"));
        howLongOp4.click();



        BekleVeKapat();


    }
}
