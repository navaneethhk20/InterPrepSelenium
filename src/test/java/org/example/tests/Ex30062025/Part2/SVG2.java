package org.example.tests.Ex30062025.Part2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class SVG2 {
    @Test
    public void testSVG2(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.amcharts.com/svg-maps/?map=india");
        List<WebElement> states =driver.findElements(By.xpath("//*[name()=\"svg\"]/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()=\"path\"]"));
        for(WebElement state :states){
            System.out.println(state.getAttribute("aria-label"));
            if(state.getAttribute("aria-label").contains("Tripura")) {
                state.click();
            }
        }
    }
}
