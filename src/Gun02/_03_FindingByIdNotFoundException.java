package Gun02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_FindingByIdNotFoundException {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.practiceselenium.com/");
        driver.manage().window().maximize();

        try {
            WebElement element = driver.findElement(By.id("id bulunamadi"));//id bulunamadiginda "no such element"
            //hatasi verir..

            System.out.println(element.getText());
        } catch (Exception ex) {
            System.out.println("id bulunamadi");
        }

        driver.quit();

    }
}
