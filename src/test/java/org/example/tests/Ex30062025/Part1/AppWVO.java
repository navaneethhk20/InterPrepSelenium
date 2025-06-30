package org.example.tests.Ex30062025.Part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppWVO {
    @Test
    public void testLogin(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        WebDriver driver= new ChromeDriver(chromeOptions);
        driver.get("https://app.vwo.com/");
        driver.findElement(By.id("login-username")).sendKeys("admin@gmail.com");
        driver.findElement(By.id("login-password")).sendKeys("Nithu123");
        driver.findElement(By.id("js-login-btn")).click();
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement error_msg = driver.findElement(By.id("js-notification-box-msg"));
        String exp_err_msg = "Your email, password, IP address or location did not match";
        Assert.assertEquals(error_msg.getText(),exp_err_msg,"expected error message is not matching");
    }
}
