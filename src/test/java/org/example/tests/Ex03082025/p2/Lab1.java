package org.example.tests.Ex03082025.p2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;


public class Lab1 {

        @Test
        public void test() {
            WebDriver driver = new ChromeDriver();
            driver.get("https://github.com/navaneethhk20");
            driver.manage().window().maximize();

            try {
                Screenshot screenshot = new AShot()
                        .shootingStrategy(ShootingStrategies
                                .viewportPasting(1000))
                        .takeScreenshot(driver);

                File source= new File("C:\\Users\\Navaneeth H K\\IdeaProjects\\InterPrepSelenium\\screenshots\\chrome_fullpage2.png");

                ImageIO.write(screenshot.getImage(), "PNG",source);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
    }

}
