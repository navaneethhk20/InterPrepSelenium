package org.example.tests.Ex05072025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Flipkart {
    WebDriver driver;
    WebDriverWait wait;
    @BeforeTest
    public void launchBrowser(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--Incognito");
        driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.flipkart.com/");
    }
    @Test
    public void perfrormTest(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        WebElement flipkart = driver.findElement(By.xpath("//img[@title=\"Flipkart\"]"));
        WebElement svg = driver.findElement(By.xpath("//img[@title=\"Flipkart\"]"));
        Assert.assertTrue(flipkart.isDisplayed());
        driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("I phone 15 plus");
        svg.click();
        driver.quit();

    }
}
