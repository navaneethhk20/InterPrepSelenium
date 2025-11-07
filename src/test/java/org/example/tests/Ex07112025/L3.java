package org.example.tests.Ex07112025;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class L3 {
    @Test
    public void test(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://app.vwo.com/");

        driver.findElement(By.name("username")).sendKeys("contact+aug@thetestingacademy.com");
        driver.findElement(By.id("login-password")).sendKeys("12300");
        driver.findElement(By.id("js-login-btn")).click();

        try{
            Thread.sleep(5);
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }

        WebElement errormsg=driver.findElement(By.id("js-notifications-box-msg"));
        Assert.assertEquals(errormsg,"Your email, password, IP address or location did not match");


    }
    @Test
    public static void test1(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://app.vwo.com/");

     //  WebElement linkText= driver.findElement(By.linkText("Start a free trial"));
      //  linkText.click();
        try {
            Thread.sleep(5);
        }catch(InterruptedException e){
            throw new RuntimeException (e);
        }
        driver.navigate().back();
        WebElement partialLink= driver.findElement(By.partialLinkText("Sign in"));
        partialLink.click();
    }
    @Test
    public static void test2(){
        WebDriver driver = new ChromeDriver();
        driver.findElement(By.xpath("//a[@tag='value']"));
        driver.findElement(By.xpath("//a[normalize-space()='space']"));
        driver.findElement(By.xpath("//a[text()='test']"));
        driver.findElement(By.xpath("//a[contains(text(),'Make')]"));
    }
}
