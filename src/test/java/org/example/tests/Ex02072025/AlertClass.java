package org.example.tests.Ex02072025;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlertClass {
    @BeforeTest
    public void alerttest(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.quit();
    }
    @Test
    public void test3alert(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.findElement(By.xpath("//a[@href=\"#Textbox\"]")).click();
        driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Nithu");
        alert.dismiss();
        driver.quit();
    }

   @AfterTest
    public void testalert2(){
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--start-maximized");
            WebDriver driver = new ChromeDriver(chromeOptions);
            driver.get("https://demo.automationtesting.in/Alerts.html");
            driver.findElement(By.xpath("//a[@href=\"#CancelTab\"]")).click();
            driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
            Alert alert = driver.switchTo().alert();
            alert.accept();
            driver.quit();
        }
    }
