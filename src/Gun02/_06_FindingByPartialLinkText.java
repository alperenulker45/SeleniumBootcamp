package Gun02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_FindingByPartialLinkText {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.practiceselenium.com");
        driver.manage().window().maximize();

        //internet sayfasinda gorunen linkten bulma.. burada html kodunda basinda a olmasi lazim (link text icin)
        //Burada linkin bir parcasini aliyoruz...

        WebElement element = driver.findElement(By.partialLinkText("Passion"));

        System.out.println(element.getAttribute("href"));//html kodundan attributu almamiz lazim

        Thread.sleep(1000);
        driver.quit();
    }
}
