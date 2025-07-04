package org.example.tests.Ex04072025.FileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class File {
    @Test
    public void  test(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/selenium/upload.html");
        WebElement upload = driver.findElement(By.xpath("//input[@type= \"file\"]"));
        upload.sendKeys("C:\\Users\\Navaneeth H K\\IdeaProjects\\InterPrepSelenium\\src\\test\\java\\org\\example\\tests\\Ex04072025\\FileUpload\\Navaneeth H_K- QA.pdf");

        driver.findElement(By.name("submit")).click();
    }
}
