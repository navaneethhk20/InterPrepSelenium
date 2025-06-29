package org.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Katalon2 {

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
            driver.findElement(By.xpath("//a[text()=\"Make Appointment\"]")).click();
            WebElement login_msg = driver.findElement(By.xpath("//p[text()='Please login to make appointment.']"));


            String exp_loginmsg = "Please login to make appointment.";
            try{
                Thread.sleep(5000);
            }catch (InterruptedException e){
                throw new RuntimeException (e);
            }
            Assert.assertEquals(login_msg.getText(),exp_loginmsg, "login message is not matching");
            try{
                Thread.sleep(5000);
            }catch (InterruptedException e){
                throw new RuntimeException (e);
            }
            driver.findElement(By.id("txt-username")).sendKeys("nithuhk");
            try{
                Thread.sleep(5000);
            }catch (InterruptedException e){
                throw new RuntimeException (e);
            }
            driver.findElement(By.id("txt-password")).sendKeys("Nithu12343");


            driver.findElement(By.id("btn-login")).click();
            try{
                Thread.sleep(5000);
            }catch (InterruptedException e){
                throw new RuntimeException (e);
            }
            WebElement loG_ERR_msg = driver.findElement(By.xpath("//p[text()='Login failed! Please ensure the username and password are valid.']"));
            Assert.assertEquals(loG_ERR_msg.getText(),"Login failed! Please ensure the username and password are valid.");
        }

        @AfterTest
        public void closeBrowser(){
            driver.close();
        }

    }

