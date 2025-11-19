package org.example.tests.EX19112025;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import  org.openqa.selenium.chrome.ChromeDriver;
import  org.openqa.selenium.chrome.ChromeOptions;
public class L3 {
    @Test
    public static void test(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");
        //options.addArguments("Headless");
        options.addArguments("--window-size=100,500");
        WebDriver driver= new ChromeDriver(options);
        driver.get("https://www.linkedin.com");
        try{
            Thread.sleep(10);
        }catch(InterruptedException e){
            throw new RuntimeException (e);
        }
        driver.quit();
    }
}
