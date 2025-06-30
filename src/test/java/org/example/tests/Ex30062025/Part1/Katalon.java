package org.example.tests.Ex30062025.Part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Katalon {
   WebDriver driver;
    @BeforeTest
    public void setupBrowser(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        driver = new ChromeDriver(chromeOptions);
        String URL= "https://katalon-demo-cura.herokuapp.com/";
        driver.get(URL);

    }

    @Test
    public void testKatalon(){
        WebElement cura_Heading = driver.findElement(By.xpath("//div[@class=\"text-vertical-center\"]/h1"));
        String cura_name = "CURA Healthcare Service";
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            throw new RuntimeException (e);
        }
        Assert.assertEquals(cura_Heading.getText(),cura_name, "Heading is not matching");

    }

    @AfterTest
    public void closeBrowser(){
        driver.close();
    }

}
