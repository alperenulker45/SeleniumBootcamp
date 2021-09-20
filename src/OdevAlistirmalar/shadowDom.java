package OdevAlistirmalar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class shadowDom {

        WebDriver driver;
        String driverPath = "Driver/chromedriver.exe";

    @BeforeTest
    public void setUp() {
        System.out.println("Opening chrome browser");
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
    }

    @Test
    public void shadowDom() {

        driver.get("https://books-pwakit.appspot.com/");
        driver.manage().window().maximize();

        WebElement host=driver.findElement(By.tagName("book-app"));

        JavascriptExecutor js=(JavascriptExecutor) driver;
        WebElement shadowdom= (WebElement) js.executeScript("return arguments[0].shadowRoot",host);

        WebElement appheader=shadowdom.findElement(By.tagName("app-header"));

        WebElement apptool=appheader.findElement(By.cssSelector("app-toolbar.toolbar-bottom"));

        WebElement book=apptool.findElement(By.tagName("book-input-decorator"));

        book.findElement(By.cssSelector("input#input")).sendKeys("yaragimi ye semih");

    }

    @AfterTest
    public void tearDown() throws InterruptedException {

        Thread.sleep(4000);
        driver.quit();
    }

}
