package org.example.tests.Ex21072025;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.openqa.selenium.*;


public class Lab03 {
    @Test
    public void test(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://awesomeqa.com/webtable.html");

       // WebElement Yoshi = driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[6]/td[2]"));

        String first = "//table[@id=\"customers\"]/tbody/tr[";
        String second = "]/td[";
        String third = "]";
        int row= driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
        int col = driver.findElements(By.id("//table[@id='customers']/tbody/tr[2]/td")).size();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                String path = first+i+second+j+third;
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                String data = driver.findElement(By.xpath(path)).getText();
                System.out.println(data);

                if(data.contains("Yoshi Tannamuri")){
                    String path1 = path+"/following-sibling::td";
                    String path2 = path+"/preceding-sibling::td";
                    String text = driver.findElement(By.xpath(path1)).getText();
                    String text2 = driver.findElement(By.xpath(path2)).getText();
                    System.out.println(text+" "+text2);
                }
            }
        }

    }
}
