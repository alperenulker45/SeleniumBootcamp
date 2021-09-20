package Gun11;

import Utilities.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _01_WaitSoru extends BaseStaticDriver {
    public static void main(String[] args) {
       /*
Senaryo
1-  https://www.demoblaze.com/index.html  siteyi açınız.
2- Samsung galaxy s6  linkine tıklayınız.
3- Sepete ekleyiniz.
4- Çıkan alerte accept yapınız.

     wait.until(ExpectedConditions.alertIsPresent());
 */

        driver.get("https://www.demoblaze.com/index.html");
        WebElement samsungs6 = driver.findElement(By.linkText("Samsung galaxy s6"));
        samsungs6.click();

        driver.findElement(By.cssSelector("a[onclick='addToCart(1)']")).click();//sepete ekleme

        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.alertIsPresent());

        driver.switchTo().alert().accept();

        driver.quit();


    }
}
