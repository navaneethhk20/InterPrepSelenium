package org.example.tests.Ex30062025;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebTable {
    WebDriver driver;
    @BeforeTest
    public void browserSetUp(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        driver= new ChromeDriver(chromeOptions);
    }
    @Test
    public void webTable(){
        String first = "//table[@id ='customers']/tbody/tr[";
        String second = "]/td[";
        String third = "]";
        String URL= "https://awesomeqa.com/webtable.html";
        driver.get(URL);

        int rows = driver.findElements(By.xpath("//table[@id ='customers']/tbody/tr")).size();


        int colms = driver.findElements(By.xpath("//table[@id =\"customers\"]/tbody/tr[5]/td")).size();


        for(int i =2;i<=rows;i++){
            for(int j=1; j<=colms;j++){
                String dy_path = first+i+second+j+third;
                String data= driver.findElement(By.xpath(dy_path)).getText();
                System.out.println(data);

                if(data.contains("Helen Bennet")){
                    String country_path = dy_path+"/following-sibling::td";
                    String country_text = driver.findElement(By.xpath(country_path)).getText();
                    System.out.println("Helen Bennet belongs to "+country_text);
                }

            }

        }

    }
}
