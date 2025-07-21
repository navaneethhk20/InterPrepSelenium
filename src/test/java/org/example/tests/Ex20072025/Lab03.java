package org.example.tests.Ex20072025;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class Lab03 {
    public  static  void main(String[] args){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addExtensions(new File("C:\\Users\\Navaneeth H K\\IdeaProjects\\InterPrepSelenium\\src\\test\\resources\\AdBlock-—-block-ads-across-the-web-Chrome-Web-Store.crx"));
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.youtube.com/watch?v=AqITZLJ5eZ4");
    }
}
