package Gun02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04_FindingByClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.practiceselenium.com/");
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.className("editor_collections"));//
        //ayni isimli class oldugu icin istedigimizi getirmeyebilir. O yuzden once id, name, class diye gitmekte
        //fayda var.

        System.out.println(element.getText());

        driver.quit();

    }
}
