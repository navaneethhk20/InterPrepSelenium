package org.example.tests.Ex20072025;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab01 {
    public static void main(String [] args){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        //chromeOptions.addArguments("--Headless");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.flipkart.com/");
       System.out.println(driver.getTitle());
       System.out.println(driver.getCurrentUrl());
       System.out.println(driver.getPageSource());
       driver.quit();
    }
}
