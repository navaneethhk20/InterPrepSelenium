package org.example.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestApp {
    public static void main (String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.linkedin.com/in/navaneeth-hk");
    }
}
