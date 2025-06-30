package org.example.tests.Ex30062025.Part2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class SVG {
    @Test
    public void testSVG(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//input[@title=\"Search for Products, Brands and More\"]")).sendKeys("Laptop");
        List<WebElement> svg = driver.findElements(By.xpath("//*[name() =\"svg\"]"));
        svg.get(0).click();

    }
}
