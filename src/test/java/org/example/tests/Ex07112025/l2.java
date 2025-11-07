package org.example.tests.Ex07112025;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class l2 {
    @Test
    public void test(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--Incognito");
        options.addExtensions(new File("C:\\Users\\Navaneeth H K\\IdeaProjects\\InterPrepSelenium\\src\\test\\resources\\AdBlock-—-block-ads-across-the-web-Chrome-Web-Store.crx"));

        WebDriver driver=  new ChromeDriver(options);
        driver.get("https://www.facebook.com");
        try {
            Thread.sleep(5);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        driver.quit();
    }

}
