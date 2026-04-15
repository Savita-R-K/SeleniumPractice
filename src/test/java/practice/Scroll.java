package practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Scroll {
    @Test
    public void scrollWindow(){
        WebDriver driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
    }

    @Test
    public void scrollTableElement(){
        WebDriver driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=100");

    }

}
