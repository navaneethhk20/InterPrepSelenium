package org.example.tests.Ex04072025.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class keyboard2 {
  WebDriver driver;
    @BeforeTest
    public void openBrow(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--guest");
        chromeOptions.addArguments("--start-maximized");
        driver = new ChromeDriver(chromeOptions);
    }

    @Test
    public void test(){
        driver.get("https://www.spicejet.com/");
        WebElement source= driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(source).click().sendKeys("BLR").perform();
    }
    @AfterTest
    public void close(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
