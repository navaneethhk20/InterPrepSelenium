package org.example.tests.Ex22072025;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import java.time.Duration;


public class Lab01 {
    WebDriver driver;
    WebDriverWait wait;
    @BeforeTest
    public void setup(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.makemytrip.com/");
    }

    @Test
    public void test() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement closemodal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy=\"closeModal\"]")));
        closemodal.click();

        Actions actions = new Actions(driver);

       WebElement fromCity = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@data-cy=\"fromCity\"]")));
        actions.moveToElement(fromCity).click().build().perform();
        WebElement enterloc = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"From\"]")));
        actions.moveToElement(enterloc).sendKeys("blr").perform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actions.moveToElement(enterloc).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).build().perform();
    }

    @AfterTest
    public void teardown(){
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw  new RuntimeException (e);
        }
        driver.quit();
    }

}
