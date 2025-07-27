package org.example.tests.Ex22072025;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Lab02 {
    @Test
    public void  test(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.name("firstname")).sendKeys("Nithu");
        driver.findElement(By.name("lastname")).sendKeys("Hosur");
        driver.findElement(By.id("sex-1")).click();
        driver.findElement(By.id("exp-2")).click();
        driver.findElement(By.id("datepicker")).sendKeys("20-04-2000");
        driver.findElement(By.id("profession-1")).click();

        driver.findElement(By.id("tool-1")).click();
        driver.findElement(By.id("tool-2")).click();


        String path = "C:\\Users\\Navaneeth H K\\IdeaProjects\\InterPrepSelenium\\src\\test\\resources\\Navaneeth H.K.pdf";
        driver.findElement(By.id("photo")).sendKeys(path);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.id("submit")).click();


//        try {
//            TakesScreenshot screenshot = (TakesScreenshot) driver;
//            File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
//
//            File destFile = new File("C:\\Users\\Navaneeth H K\\IdeaProjects\\InterPrepSelenium\\screenshots\\fullpage.png");
//            FileUtils.copyFile(sourceFile, destFile);
//
//            System.out.println("Full page screenshot saved successfully!");
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        try{
            TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
            File sourcefile =takesScreenshot.getScreenshotAs(OutputType.FILE);
            File destinfile =new File("C:\\Users\\Navaneeth H K\\IdeaProjects\\InterPrepSelenium\\screenshots\\fail.png");
            FileUtils.copyFile(sourcefile,destinfile);
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
