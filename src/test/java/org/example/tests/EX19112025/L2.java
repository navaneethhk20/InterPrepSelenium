package org.example.tests.EX19112025;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


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

    @Test
    public void test3(){
        WebDriver driver=new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.get("https://www.facebook.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']"))).sendKeys("nithu");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='pass']"))).sendKeys("123");
        driver.findElement(By.name("login")).click();
        driver.quit();
    }
    @Test
    public void test4(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        Wait<WebDriver> wait= new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);

        WebElement element =wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));
        element.click();
    }
}
