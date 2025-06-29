package org.example.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.io.File;

public class OptionClasses {
    @Test
    public void testOption(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addExtensions(new File("C:\\Users\\Navaneeth H K\\IdeaProjects\\InterPrepSelenium\\src\\test\\resources\\AdBlock-—-block-ads-across-the-web-Chrome-Web-Store.crx"));
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.youtube.com/watch?v=kaG3nTdiRX0&t=287s");

    }
}
