package OdevAlistirmalar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _21_ {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("https://en.wikipedia.org/wiki/FIFA_World_Cup");

        WebElement allTimeChamp = driver.findElement(By.cssSelector("a[href='#All-time_table_for_champions']"));
        allTimeChamp.click();

        WebElement argParticipation =  driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[8]/tbody/tr[4]/td[3]"));
        System.out.println(argParticipation.getText());

        driver.quit();
    }
}
