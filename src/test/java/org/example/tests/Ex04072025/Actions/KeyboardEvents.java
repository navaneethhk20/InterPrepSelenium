package org.example.tests.Ex04072025.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class KeyboardEvents {
    static WebDriver driver;
    @BeforeTest
            public static void before() {


        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--guest");
        driver = new ChromeDriver(chromeOptions);
    }


    @Test
    public static void test(){
        driver.get("https://awesomeqa.com/practice.html");
        WebElement firstname = driver.findElement(By.xpath("//input[@name=\"firstname\"]"));

        Actions actions = new Actions(driver);
        actions.keyDown(Keys.SHIFT).sendKeys(firstname,"testing is in progress").keyUp(Keys.SHIFT).perform();
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
