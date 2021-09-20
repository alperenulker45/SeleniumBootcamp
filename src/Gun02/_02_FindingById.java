package Gun02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindingById {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.practiceselenium.com/");
        driver.manage().window().maximize();

        WebElement e = driver.findElement(By.id("wsb-element-00000000-0000-0000-0000-000450914894"));

        System.out.println(e.getText());//site uzerinde id sini buldugumuz elemanin sitede gorunen textini yazdi


        Thread.sleep(2000);
        driver.quit();



    }
}
