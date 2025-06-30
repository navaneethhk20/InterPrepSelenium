package org.example.tests.Ex30062025.Part1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class OptionClasses {
    @Test
    public void testOption(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addExtensions(new File("C:\\Users\\Navaneeth H K\\IdeaProjects\\InterPrepSelenium\\src\\test\\resources\\AdBlock-—-block-ads-across-the-web-Chrome-Web-Store.crx"));
        WebDriver driver = new ChromeDriver(chromeOptions);
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.get("https://youtu.be/tFfpSSDCTD4?si=CAnRSv6QkQ0OzWwM");

    }
}
