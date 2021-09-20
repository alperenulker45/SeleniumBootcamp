package Gun06.Proje;

import Utilities.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _2_Senaryo extends BaseStaticDriver {

    public static void main(String[] args) {
        //1- https://www.saucedemo.com/ sitesini açınız.
        //2- Ekranda görünen usernamleri bir string diziye atınız.
        //3- Bu username ve passwordlarını hepsinin login olup olamadığını
        //   login olduktan sonraki sayfada Products kelimesinin kontrol ederek
        //   doğrulayınız.
        //   diğer login kontrolleri için navigate.back kullanınız.
        //4- Login olamayan userları ve hata bilgisini yazdırınız.
        // Sadece XPath kullanınız.

        driver.get("https://www.saucedemo.com/");

        String userNames = driver.findElement(By.xpath("//div[@id='login_credentials']")).getText();

        String [] userNameList = userNames.split("\n");
        String passwordText="secret_sauce";

        for (int i=1; i<userNameList.length; i++) {
            WebElement usernameInput = driver.findElement(By.xpath("//input[@id='user-name']"));
            usernameInput.clear();
            usernameInput.sendKeys(userNameList[i]);

            WebElement passwordInput = driver.findElement(By.xpath("//input[@id='password']"));
            usernameInput.clear();
            passwordInput.sendKeys(passwordText);


            WebElement login= driver.findElement(By.xpath("//input[@value='Login']"));
            login.click();

            try {
                WebElement correction = driver.findElement(By.xpath("//span[@class='title']"));
                Assert.assertEquals("PRODUCTS", correction.getText());
                driver.navigate().back();
                System.out.println("login oldu");
            }

            catch (Exception e) {
                WebElement errorMessage = driver.findElement(By.xpath("//h3[@data-test='error']"));
                System.out.println(userNameList[i] + " " + errorMessage.getText());
                System.out.println("login olamadi");
                driver.navigate().refresh();
            }

        }
        BekleVeKapat();
    }
}
