package org.example.tests.Ex21072025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab01 {
    @Test
    public void test(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        WebDriver driver= new ChromeDriver(chromeOptions);
        driver.get("https://app.vwo.com/");
        WebElement usernameField = driver.findElement(By.id("login-username"));
        usernameField.sendKeys("nithu@gmail.com");
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("Nithu@123");
        WebElement signinButton = driver.findElement(By.id("js-login-btn"));
        signinButton.click();
        WebElement error_msg = driver.findElement(By.id("js-notification-box-msg"));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals(error_msg.getText(),"Your email, password, IP address or location did not match");

        WebElement freetrail = driver.findElement(By.linkText("Start a free trial"));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertTrue(freetrail.isDisplayed());




    }
}
