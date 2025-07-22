package org.example.tests.Ex22072025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import java.util.Set;

import java.util.List;

public class Lab04 {
    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/test/ab/13/heatmaps/1?token=eyJhY2NvdW50X2lkIjo2NjY0MDAsImV4cGVyaW1lbnRfaWQiOjEzLCJjcmVhdGVkX29uIjoxNjcxMjA1MDUwLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiY2IwNzBiYTc5MDM1MDI2N2QxNTM5MTBhZDE1MGU1YTUiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&isHttpsOnly=1&accountId=666400");
        driver.manage().window().maximize();

        String parentwindow = driver.getWindowHandle();

        List<WebElement> listofmaps = driver.findElements(By.xpath("//div[@data-qa=\"yedexafobi\"]"));

        Actions actions = new Actions(driver);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actions.moveToElement(listofmaps.get(1)).click().perform();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Set<String> windowhandles = driver.getWindowHandles();
        for(String handle: windowhandles){
            if(!handle.equals(parentwindow)){
                driver.switchTo().window(handle);
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                driver.switchTo().frame("heatmap-iframe");
                WebElement click_map_button = driver.findElement(By.xpath("//span[@data-qa=\"refoyekife\"]"));
                click_map_button.click();
            }
        }



    }
}
