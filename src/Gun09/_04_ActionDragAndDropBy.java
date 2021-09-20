package Gun09;

import Utilities.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _04_ActionDragAndDropBy extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");

        WebElement leftslide = driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-state-default ui-corner-all'])[1]"));
        WebElement rightslide = driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-state-default ui-corner-all'])[2]"));
        WebElement slider = driver.findElement(By.id("slider-range"));

        double sliderRange = slider.getSize().width;
        System.out.println("sliderRange = " + sliderRange);

        Actions movers = new Actions(driver);
        Action move = movers.dragAndDropBy(leftslide, -100, 0).build();
        Action move2= movers.dragAndDropBy(rightslide, 202, 0).build();
        Bekle(2);
        move.perform();
        move2.perform();

        double slideRange = sliderRange/500;

        Action move3 = movers.dragAndDropBy(leftslide, (int)(200*slideRange), 0).build();
        Action move4 = movers. dragAndDropBy(rightslide, (int)(-100*slideRange), 0).build();

        move3.perform();
        move4.perform();


        BekleVeKapat();
    }
}
