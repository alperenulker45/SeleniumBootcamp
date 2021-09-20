package Gun13;

import Utilities.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_Cozum2 extends BaseStaticDriver {

    public static void main(String[] args) {

        String url = "https://testsheepnz.github.io/BasicCalculator.html";
        driver.get(url);
        int random1 = randomNumCreator(100);
        int random2 = randomNumCreator(100);

        WebElement firstBox = driver.findElement(By.id("number1Field"));
        firstBox.clear();
        firstBox.sendKeys(String.valueOf(random1));

        WebElement secondBox = driver.findElement(By.id("number2Field"));
        secondBox.clear();
        secondBox.sendKeys(String.valueOf(random2));

        String calculate = selectDropDown(String.valueOf(DO.Multiply));

        driver.findElement(By.id("calculateButton")).click();

        assertCalculation(calculate, random1, random2);

        driver.quit();

    }

    public static int randomNumCreator(int x) {
        return (int) (Math.random()*x);
    }

    /**
     *
     * @param calculation must be Add, Subtract, Multiply, Divide, Concatenate
     * @return
     */
    public static String selectDropDown (String calculation) {
        WebElement islem = driver.findElement(By.id("selectOperationDropdown"));
        Select secim = new Select(islem);
        secim.selectByVisibleText(calculation);
        return secim.getFirstSelectedOption().getText();

    }

    public static void assertCalculation (String calculation, int random1, int random2){
        WebElement result = driver.findElement(By.id("numberAnswerField"));
        switch (calculation) {

            case "Add":
                Assert.assertEquals(random1 + random2, Integer.parseInt(result.getAttribute("value")));
                break;

            case "Subtract":
                Assert.assertEquals(random1 - random2, Integer.parseInt(result.getAttribute("value")));
                break;

            case "Multiply":
                Assert.assertEquals(random1 * random2, Integer.parseInt(result.getAttribute("value")));
                break;

            case "Divide":
                Assert.assertEquals((double) random1 / random2, Double.parseDouble(result.getAttribute("value")), 0.09);
                break;

            case "Concenate" :
                Assert.assertEquals(random1 +String.valueOf(random2), result.getAttribute("value"));
                break;
        }
        System.out.println(random1 + " " + calculation + " " + random2 +"= " + result.getAttribute("value"));
    }

}
