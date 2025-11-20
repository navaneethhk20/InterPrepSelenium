package org.example.tests.EX19112025;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



public class l5 {
    @Test
    public void test(){
    WebDriver driver = new ChromeDriver();
    driver.get("https://demo.automationtesting.in/Alerts.html");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();

    Alert alert = driver.switchTo().alert();
    alert.accept();

    Actions actions = new Actions(driver);
    //actions.dragAndDrop(from,to).perform();

    }
}
