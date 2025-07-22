package org.example.tests.Ex22072025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Lab03 {
    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/windows");
        String firstwindow = driver.getWindowHandle();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Click Here\"]"))).click();

        Set<String> windowhangles= driver.getWindowHandles();
        for(String handle: windowhangles){
            driver.switchTo().window(handle);
            if(driver.getWindowHandle().contains("New Window")){
                System.out.println("Passed");
            }
            driver.switchTo().window(firstwindow);
        }
    }
}
