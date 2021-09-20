package Project4;

import Utilities.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_ extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://demowebshop.tricentis.com/");

        WebElement login = driver.findElement(By.linkText("Log in"));
        login.click();

        driver.findElement(By.id("Email")).sendKeys("avalperenulker@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Gs.1905");
        driver.findElement(By.cssSelector("input[class='button-1 login-button']")).click();

        WebElement computers = driver.findElement(By.xpath("(//a[@href='/computers'])[3]"));
        computers.click();
        WebElement desktop = driver.findElement(By.xpath("(//a[@href='/desktops'])[3]"));
        desktop.click();

        WebElement expComp = driver.findElement(By.xpath("(//input[@value='Add to cart'])[3]"));
        expComp.click();

        WebElement fastRadio = driver.findElement(By.id("product_attribute_74_5_26_82"));
        fastRadio.click();

        WebElement sekizGb = driver.findElement(By.id("product_attribute_74_6_27_85"));
        sekizGb.click();

        WebElement hdd = driver.findElement(By.id("product_attribute_74_3_28_87"));
        hdd.click();

        WebElement software = driver.findElement(By.id("product_attribute_74_8_29_90"));
        software.click();

        WebElement addToCart = driver.findElement(By.id("add-to-cart-button-74"));
        addToCart.click();

        WebElement shopCart = driver.findElement(By.xpath("(//span[@class='cart-label'])[1]"));
        shopCart.click();

        WebElement chckBox = driver.findElement(By.id("termsofservice"));
        chckBox.click();

        WebElement checkOut = driver.findElement(By.id("checkout"));
        checkOut.click();

        WebElement country = driver.findElement(By.id("BillingNewAddress_CountryId"));
        Select ddCountry = new Select(country);

        ddCountry.selectByValue("37");

        driver.findElement(By.id("BillingNewAddress_City")).sendKeys("amsterdam");
        driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("29ekim");
        driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("12345");
        driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("1234567");

        WebElement cont = driver.findElement(By.xpath("(//input[@value='Continue'])[1]"));
        cont.click();

        WebElement cont2 = driver.findElement(By.cssSelector("input[onclick='Shipping.save()']"));
        cont2.click();

        WebElement cont3 = driver.findElement(By.cssSelector("input[onclick='ShippingMethod.save()']"));
        cont3.click();

        WebElement cont4 = driver.findElement(By.cssSelector("input[onclick='PaymentMethod.save()']"));
        cont4.click();

        WebElement cont5 = driver.findElement(By.cssSelector("input[onclick='PaymentInfo.save()']"));
        cont5.click();

        WebElement confrm = driver.findElement(By.cssSelector("input[onclick='ConfirmOrder.save()']"));
        confrm.click();

        WebElement checkTxt = driver.findElement(By.cssSelector("div[class='title']>strong"));

        Assert.assertEquals("Your order has been successfully processed!", checkTxt.getText());

        driver.quit();

    }
}
