package Gun03.Proje1.Part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class ReadMe {

    /*

        1) Bu siteye gidin. ->  http://demoqa.com/text-box

        2) Full Name kısmına "Automation" girin.

        3) Email kısmına "Testing" girin.

        4) Current Address kısmına "Testing Current Address" girin.

        5) Permanent Address kısmına "Testing Permanent Address" girin.

        6) Submit butonuna tıklayınız.

        7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.

        8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.

     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("http://demoqa.com/text-box");
        driver.manage().window().maximize();

        Thread.sleep(1000);
        WebElement username = driver.findElement(By.id("userName"));
        username.sendKeys("Automation");

        Thread.sleep(1000);
        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("Testing@techno.com");

        Thread.sleep(1000);
        WebElement currentAddress= driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("Testing Current Address");

        Thread.sleep(1000);
        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys("Testing Permanent Address");

        Thread.sleep(1000);
        WebElement submit = driver.findElement(By.className("btn-primary"));
        submit.click();

        WebElement getname = driver.findElement(By.id("name"));
        String nametxt = getname.getText();
        Assert.assertEquals("Name:Automation", nametxt);

        WebElement getemail = driver.findElement(By.id("email"));
        String emailtxt = getemail.getText();
        Assert.assertEquals("Email:Testing@techno.com", emailtxt);

        Thread.sleep(2000);
        driver.quit();

    }
}
