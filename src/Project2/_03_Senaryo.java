package Project2;

import Utilities.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class _03_Senaryo extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://zero.webappsecurity.com/login.html");

        WebElement login = driver.findElement(By.id("user_login"));
        login.sendKeys("username");

        WebElement password = driver.findElement(By.id("user_password"));
        password.sendKeys("password");

        WebElement signIn = driver.findElement(By.cssSelector("input[value='Sign in']"));
        signIn.click();

        WebElement safety = driver.findElement(By.id("primary-button"));
        safety.click();

        driver.findElement(By.id("onlineBankingMenu")).click();

        driver.findElement(By.id("pay_bills_link")).click();

        Bekle(2);

        driver.findElement(By.xpath("//li[@class='ui-state-default ui-corner-top'][2]")).click();

        Select currency = new Select(driver.findElement(By.id("pc_currency")));
        currency.selectByVisibleText(Random());

        driver.findElement(By.id("pc_amount")).sendKeys("150");

        driver.findElement(By.id("pc_inDollars_true")).click();

        driver.findElement(By.id("purchase_cash")).click();

        WebElement txt = driver.findElement(By.id("alert_content"));

        Assert.assertEquals("Foreign currency cash was successfully purchased.", txt.getText());

        driver.quit();

    }

    public static String Random() {

        List<WebElement> currency = driver.findElements(By.cssSelector("select[id='pc_currency']>option"));
        currency.remove(0);

        String str = currency.get((int) ((Math.random() * 15))).getText();

        return str;
    }
}
