package org.example.tests.EX19112025;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class L1 {
    @Test
    public void test(){
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://facebook.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        try {
            Thread.sleep(10);
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
