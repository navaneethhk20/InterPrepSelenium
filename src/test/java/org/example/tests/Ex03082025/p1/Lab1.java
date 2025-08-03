package org.example.tests.Ex03082025.p1;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Lab1  {
    @Test
    public void test(){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://github.com/navaneethhk20");
        driver.manage().window().maximize();
        try {
            File source = ((FirefoxDriver) driver).getFullPageScreenshotAs(OutputType.FILE);
            File destin = new File("C:\\Users\\Navaneeth H K\\IdeaProjects\\InterPrepSelenium\\screenshots\\getfullpage.png");
            FileUtils.copyFile(source, destin);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
