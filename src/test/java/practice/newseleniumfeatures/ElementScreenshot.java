package practice.newseleniumfeatures;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class ElementScreenshot {
    @Test
    public void elementScreenshot() throws IOException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebElement ele=driver.findElement(By.xpath("//button[text()='Home']"));
        File src=ele.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("screenshots/elementScreenshot.png"));
    }
}
