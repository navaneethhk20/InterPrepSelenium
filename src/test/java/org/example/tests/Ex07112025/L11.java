package org.example.tests.Ex07112025;
import org.openqa.selenium.WebDriver;
import  org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class L11 {
    @Test
    public void openBrowser() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        String title= driver.getTitle();
        String url= driver.getCurrentUrl();
        Assert.assertEquals(title,"Google");
        Assert.assertEquals(url,"https://www.google.com/");
        driver.close();
    }

    @Test
    public void testPage(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");
        if(driver.getPageSource().contains("CURA Healthcare Service")){
            System.out.println("Visible");
        }else {
            System.out.println("not visible");
        }
       try{
           Thread.sleep(10);
       }catch(InterruptedException e) {
           throw new RuntimeException(e);
       }
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }

    @Test
    public void testSource(){

    }
}
