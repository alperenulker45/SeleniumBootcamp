package Gun13;

import Utilities.BaseStaticDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;


import java.io.File;
import java.io.IOException;
import java.util.List;

public class _02_RecordWindow extends BaseStaticDriver {
    public static void main(String[] args) throws IOException {
        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");

        driver.findElement(By.id("txtPassword")).sendKeys("admin123");

        driver.findElement(By.id("btnLogin")).click();

        List<WebElement> errorMessage = driver.findElements(By.id("spanMessage"));

        if (errorMessage.size()==0) {  //login olmus demektir. Hata yok

            System.out.println("Succesfully Logged In");

        }

        else { //login olamamistir. Hata var.

            System.out.println("Not Logged in");
            //Burada verilen bilgiyle login olamadigi icin ekran kaydini alip developera gonderecegiz.
            TakesScreenshot screenshot = (TakesScreenshot) driver;//1. Asama, ekran goruntusu alma degiskeni tanimlandi.
            File screenShotfile = screenshot.getScreenshotAs(OutputType.FILE);//2.Asama, alinacak ekran goruntusu dosya tipi
            FileUtils.copyFile(screenShotfile, new File("ekranGoruntuleri/Orange/LoginKontrol.jpg"));
            //ekrandaki  goruntuyu al, verdigim yola ve isme kaydet.
            //jpg, bng, gif, png

            //odev --> buradaki dosya adini date, time'a bagli hale getirin ki her zaman farkli isimde kaydetsin.


        }

       BekleVeKapat();



    }
}
