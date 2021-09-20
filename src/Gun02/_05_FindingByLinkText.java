package Gun02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _05_FindingByLinkText {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.practiceselenium.com/");
        driver.manage().window().maximize();

        //internet sayfasinda gorunen linkten bulma.. burada html kodunda basinda a olmasi lazim (link text icin)

        WebElement element = driver.findElement(By.linkText("Check Out"));

        System.out.println(element.getAttribute("data-title"));//html kodundan attributu almamiz lazim

        driver.quit();
    }
}
