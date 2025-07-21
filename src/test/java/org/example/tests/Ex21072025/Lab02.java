package org.example.tests.Ex21072025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab02 {
    @Test
    public void test(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        WebElement health = driver.findElement(By.xpath("//h1[text()=\"CURA Healthcare Service\"]"));
        WebElement makeAppointment = driver.findElement(By.xpath("//a[normalize-space()=\"Make Appointment\"]"));
        WebElement wecare = driver.findElement(By.xpath("//h3[normalize-space()=\"We Care About Your Health\"]"));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertTrue(makeAppointment.isDisplayed());
        Assert.assertEquals(health.getText(), "CURA Healthcare Service","Message is not matching");
        Assert.assertEquals(wecare.getText(), "We Care About Your Health","We care Message is not matching");


    }
}
