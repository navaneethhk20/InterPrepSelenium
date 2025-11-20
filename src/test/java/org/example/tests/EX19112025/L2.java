package org.example.tests.EX19112025;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

import java.time.Duration;

public class L2 {
    @Test
    public static void  test(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        driver.findElement(By.id("email")).sendKeys("hknavaneeth@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("nithu123");
        driver.findElement(By.partialLinkText("Forgotten")).click();
        //driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    @Test
    public static void  test2(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.quit();
    }
}
