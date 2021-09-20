package Project4;

import Utilities.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class _01_ extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.navigate().to("http://demowebshop.tricentis.com/");
        String window1 = driver.getWindowHandle();

        WebElement login = driver.findElement(By.linkText("Log in"));
        login.click();

        driver.findElement(By.id("Email")).sendKeys("avalperenulker@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Gs.1905");
        driver.findElement(By.cssSelector("input[class='button-1 login-button']")).click();

        WebElement facebook = driver.findElement(By.linkText("Facebook"));
        facebook.click();

        Set<String> windowallWindows=driver.getWindowHandles();

        for (String window:windowallWindows){

            driver.switchTo().window(window);
        }

        //String windowId = driver.getWindowHandle();
        //driver.switchTo().window(windowId);
        String url2 = driver.getCurrentUrl();
        System.out.println(url2);

        Assert.assertTrue(url2.contains("facebook"));
        driver.close();

        driver.switchTo().window(window1);

        WebElement contact = driver.findElement(By.linkText("Contact us"));
        contact.click();

        WebElement msj = driver.findElement(By.id("Enquiry"));
        msj.sendKeys("Merhaba Dunya");

        WebElement sbmtBtn = driver.findElement(By.name("send-email"));
        sbmtBtn.click();

        WebElement result = driver.findElement(By.cssSelector("div[class='result']"));
        Assert.assertEquals("Your enquiry has been successfully sent to the store owner.", result.getText());

        Bekle(3);

        driver.quit();








    }

}
