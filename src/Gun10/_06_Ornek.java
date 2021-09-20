package Gun10;

import Utilities.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _06_Ornek extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.seleniumeasy.com/test/ajax-form-submit-demo.html");

        WebElement title = driver.findElement(By.id("title"));
        title.sendKeys("Alperen");

        WebElement submit = driver.findElement(By.id("btn-submit"));
        submit.click();

        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.textToBe(By.id("submit-control"), "Form submited Successfully!"));

        driver.quit();
    }
}
