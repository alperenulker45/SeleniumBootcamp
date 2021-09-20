package Mentora;

import Utilities.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class _orneksoru {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\testeralpi\\Selenium\\Chrome Driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demo.guru99.com/test/guru99home/");
        String mainPage= driver.getWindowHandle();
        driver.manage().window().maximize();
        //driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        WebElement frame1= driver.findElement(By.id("a077aa5e"));
        driver.switchTo().frame(frame1);

        WebElement clickPicture= driver.findElement(By.cssSelector("img[src='Jmeter720.png']"));
        clickPicture.click();

        Set<String> pageIds=driver.getWindowHandles();
        for (String id: pageIds)
        {
            if (id.equals(mainPage)) continue;
            driver.switchTo().window(id);
            //driver.close();
        }

        WebElement python= driver.findElement(By.xpath("(//div[@class='canvas-middle'])[6]"));
        BaseStaticDriver.waitUntClickable(python, 15);
        python.click();

        driver.switchTo().window(mainPage);
        System.out.println(driver.getCurrentUrl());

    }

}
