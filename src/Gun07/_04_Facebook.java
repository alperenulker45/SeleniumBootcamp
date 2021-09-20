package Gun07;

import Utilities.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _04_Facebook extends BaseStaticDriver {
    public static void main(String[] args) {
        /*
        Senaryo
        1- https://www.facebook.com/ sitesine giriniz.
        2- Yeni hesap oluştura tıklayınız.
        3- Formdaki tüm bilgileri giriniz.

        create new account = a[id^='u_0_2'][class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']
        name="firstname"
        name="lastname"
        name="reg_email__"
        name="reg_passwd__"
        select id="day"
                   "month"
                   "year"

        input[name='sex'][value='2']
        name="websubmit"

        */

        /*

        İnterview larda dinamik eleman nedir ? ne nasıl bulursunuz ?
   Sayfa yenilendiğinde id ler veya locator lar değişiyorsa buna dinamik eleman denir.
   Aşağıdaki fonksiyonlar ile bulunur.
   cssSelector: ^,$,*  veya Xpath : starts-with, ends-with,contains

         */

        driver.get("https://www.facebook.com/");
        driver.manage().deleteAllCookies();

        WebElement acceptCookiesBttn = driver.findElement(By.cssSelector("button[id^='u_0_j'"));
        acceptCookiesBttn.click();

        WebElement newAccountBttn = driver.findElement(By.cssSelector("a[id^='u_0_2'][class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
        newAccountBttn.click();

        Bekle(2);

        WebElement inputName= driver.findElement(By.name("firstname"));
        inputName.sendKeys("ali");

        Bekle(1);

        WebElement inputLastName = driver.findElement(By.name("lastname"));
        inputLastName.sendKeys("celik");

        Bekle(1);

        WebElement inputMail = driver.findElement(By.name("reg_email__"));
        inputMail.sendKeys("alicel@celikcelik.com");

        Bekle(1);

        WebElement inputMailAgain = driver.findElement(By.name("reg_email_confirmation__"));
        inputMailAgain.sendKeys("alicel@celikcelik.com");

        Bekle(1);

        WebElement inputPassword = driver.findElement(By.name("reg_passwd__"));
        inputPassword.sendKeys("123456");

        Bekle(1);

        WebElement day = driver.findElement(By.id("day"));
        Select whichday = new Select(day);
        whichday.selectByValue("10");

        Bekle(1);

        WebElement month = driver.findElement(By.id("month"));
        Select whichMonth = new Select(month);
        whichMonth.selectByValue("4");

        Bekle(1);

        WebElement year = driver.findElement(By.id("year"));
        Select whichYear = new Select(year);
        whichYear.selectByValue("1990");

        WebElement sexRadio = driver.findElement(By.cssSelector("input[name='sex'][value='2']"));
        sexRadio.click();

        Bekle(1);

        WebElement submitBttn = driver.findElement(By.name("websubmit"));
        submitBttn.click();

        Bekle(5);

        BekleVeKapat();


    }
}
