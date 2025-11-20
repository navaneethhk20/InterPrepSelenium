package org.example.tests.EX19112025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class L4 {
   @Test
    public void test(){
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://proleed.academy/exercises/selenium/automation-practice-form-with-radio-button-check-boxes-and-drop-down.php");
       WebElement elementtobeselected   = driver.findElement(By.id("prefix"));
       Select select = new Select(elementtobeselected);
       select.selectByIndex(2);

       select.selectByVisibleText("Indian");

    }
}
