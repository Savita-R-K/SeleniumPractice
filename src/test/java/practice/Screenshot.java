package practice;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Screenshot {
    @Test
    public void pageScreenshot() throws IOException {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver= new ChromeDriver(options);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("screenshots/pageScreenshot.png"));
    }

}
