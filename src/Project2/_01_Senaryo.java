package Project2;

import Utilities.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _01_Senaryo extends BaseStaticDriver {
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

        WebElement trnsfFunds = driver.findElement(By.id("transfer_funds_link"));
        trnsfFunds.click();

        WebElement fromAccount = driver.findElement(By.id("tf_fromAccountId"));
        String random = String.valueOf((int) (Math.random()*6+1));

        Select ddFromAccount = new Select(fromAccount);
        ddFromAccount.selectByValue(random);

        WebElement toAccount = driver.findElement(By.id("tf_toAccountId"));
        String random2 = String.valueOf((int) (Math.random()*6+1));

        Select ddToAccount = new Select(toAccount);
        ddToAccount.selectByValue(random2);

        WebElement amount = driver.findElement(By.id("tf_amount"));
        amount.sendKeys("2500");

        WebElement description = driver.findElement(By.id("tf_description"));
        description.sendKeys("parayi ez");

        driver.findElement(By.id("btn_submit")).click();

        driver.findElement(By.id("btn_submit")).click();

        WebElement success = driver.findElement(By.cssSelector("div[class='alert alert-success']"));

        Assert.assertEquals("You successfully submitted your transaction.", success.getText());

        Bekle(2);

        driver.quit();
    }
}
