package OdevAlistirmalar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _05_ {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\testeralpi\\Selenium\\Chrome Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        driver.manage().window().maximize();

        WebElement calculate = driver.findElement(By.id("calculate"));
        calculate.click();

        driver.findElement(By.id("number1")).sendKeys("213");
        driver.findElement(By.id("number2")).sendKeys("31");
        driver.findElement(By.id("calculate")).click();

        WebElement result = driver.findElement(By.id("answer"));
        System.out.println(result.getText());

        driver.quit();
    }

}
