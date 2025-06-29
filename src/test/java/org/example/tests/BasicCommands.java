package org.example.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BasicCommands {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.applitools.com");
        String title=  driver.getTitle();
        String url=driver.getCurrentUrl();
        String page=driver.getPageSource();
        Assert.assertEquals(url,"https://demo.applitools.com/");
        Assert.assertEquals(title,"ACME Demo App by Applitools");
        Assert.assertTrue(page.contains("Login Form"));
        driver.manage().window().minimize();
        driver.navigate().to("https://www.google.com");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.manage().window().fullscreen();
        driver.navigate().refresh();
        driver.navigate().back();
        driver.navigate().forward();
        driver.close();
    }
}
