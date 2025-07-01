package org.example.tests.Ex01072025.SelectBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class RadioCheckText {

    @Test
    public void test(){
        ChromeOptions chromeOptions= new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://proleed.academy/exercises/selenium/automation-practice-form-with-radio-button-check-boxes-and-drop-down.php");
        WebElement dr = driver.findElement(By.xpath("//select[@id=\"prefix\"]"));
        Select select = new Select(dr);
        select.selectByIndex(1);
        driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Navaneeth");
        driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("H K");
        driver.findElement(By.xpath("//input[@type=\"radio\" and @id = \"pension\"]")).click();
        driver.findElement(By.xpath("//input[@type=\"checkbox\" and @id = \"votercard\"]")).click();

    }
}
