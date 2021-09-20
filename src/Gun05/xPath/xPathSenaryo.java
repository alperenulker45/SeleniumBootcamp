package Gun05.xPath;

import Utilities.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class xPathSenaryo extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.saucedemo.com/");

        WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
        userName.sendKeys("standard_user");

        Bekle(1);

        WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
        password.sendKeys("secret_sauce");

        Bekle(1);

        WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();

        Bekle(1);

        WebElement backPackElement = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        backPackElement.click();

        Bekle(1);

        WebElement addToCart = driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-backpack']"));
        addToCart.click();

        Bekle(1);

        WebElement backButton = driver.findElement(By.xpath("//*[text()='Back to products']"));
        backButton.click();

        Bekle(1);

        WebElement tshirt = driver.findElement(By.xpath("//*[text()='Sauce Labs Bolt T-Shirt']"));
        tshirt.click();

        Bekle(1);

        WebElement tshirtAddToCart = driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
        tshirtAddToCart.click();

        Bekle(1);

        WebElement box = driver.findElement(By.xpath("//div[@id='shopping_cart_container']"));
        box.click();

        Bekle(1);

        WebElement checkOut = driver.findElement(By.xpath("//button[@id='checkout']"));
        checkOut.click();

        Bekle(1);

        WebElement firstNameInput = driver.findElement(By.xpath("//input[@id='first-name']"));
        firstNameInput.sendKeys("alp");

        Bekle(1);

        WebElement surNameInput = driver.findElement(By.xpath("//*[@id='last-name']"));
        surNameInput.sendKeys("ilker");

        Bekle(1);

        WebElement postalCode = driver.findElement(By.xpath("//*[@id='postal-code']"));
        postalCode.sendKeys("12345");

        WebElement cont = driver.findElement(By.xpath("//*[@class='submit-button btn btn_primary cart_button btn_action']"));
        cont.click();

        WebElement price1 = driver.findElement(By.xpath("(//div[@class='inventory_item_price'])[1]"));
        String price1Txt = price1.getText();
        double price1double = strToDouble(price1Txt);

        WebElement price2= driver.findElement(By.xpath("(//div[@class='inventory_item_price'])[2]"));
        String price2Txt= price2.getText();
        double price2double = strToDouble(price2Txt);

        WebElement total = driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
        String totalTxt = total.getText();
        double totaldouble = strToDouble(totalTxt);

        Assert.assertEquals(totaldouble, price1double + price2double, 0.0);

        BekleVeKapat();
    }

    public static double strToDouble (String price) {
        String priceDouble = price.replaceAll("[^0-9.]", "");

        return Double.parseDouble(priceDouble);
    }

}
