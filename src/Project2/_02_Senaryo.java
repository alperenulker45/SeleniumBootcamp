package Project2;

import Utilities.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class _02_Senaryo extends BaseStaticDriver {
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

        List<WebElement> payee = driver.findElements(By.cssSelector("select[id='sp_payee']>option"));

        Select ddPayee = new Select(driver.findElement(By.id("sp_payee")));
        ddPayee.selectByVisibleText(payee.get((int) (Math.random()*3+1)).getText());

        WebElement account = driver.findElement(By.id("sp_account"));
        String random2 = String.valueOf((int) (Math.random()*6+1));

        Select ddAccount = new Select(account);
        ddAccount.selectByValue(random2);

        driver.findElement(By.id("sp_amount")).sendKeys("1000");

        WebElement date = driver.findElement(By.id("sp_date"));
        date.sendKeys("2021-05-21");

        driver.findElement(By.id("sp_description")).sendKeys("odeme");

        driver.findElement(By.id("pay_saved_payees")).click();

        WebElement success = driver.findElement(By.cssSelector("div[id='alert_content']>span"));

        Assert.assertEquals("The payment was successfully submitted.", success.getText());

        Bekle(2);

        driver.quit();
    }
}
