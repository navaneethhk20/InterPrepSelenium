package org.example.tests.Ex20072025;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Lab02 {
    public static void main(String[] args){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.navigate().to("https://google.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.close();
    }
}
