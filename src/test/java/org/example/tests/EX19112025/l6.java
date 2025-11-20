package org.example.tests.EX19112025;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.Set;
public class l6 {
    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.manage().window().maximize();
        String parentwindow= driver.getWindowHandle();
        driver.findElement(By.partialLinkText("Click")).click();
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Set<String> windowhandle=driver.getWindowHandles();
        for(String handle: windowhandle){
            driver.switchTo().window(handle);
            if(driver.getPageSource().contains("New Window")){
                driver.switchTo().window(parentwindow);
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
driver.quit();
    }
}
