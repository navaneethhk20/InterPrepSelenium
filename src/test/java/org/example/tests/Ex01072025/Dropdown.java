package org.example.tests.Ex01072025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown {
    @Test
    public void drop(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://practice.expandtesting.com/dropdown");
        WebElement dr = driver.findElement(By.xpath("//select[@id =\"dropdown\"]"));
        Select select = new Select(dr);
       // select.selectByIndex(1);
        select.selectByVisibleText("Option 2");
    }
}
