package org.example.tests.EX19112025;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;
public class TestMethod {
    @Test
    public static void test(){
        WebDriver driver= new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
        String url=driver.getCurrentUrl();
        String tile=   driver.getTitle();
        String source= driver.getPageSource();
        System.out.println(url);
        System.out.println(tile);
        System.out.println(source);
    }
}
