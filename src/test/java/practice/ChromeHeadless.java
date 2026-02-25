package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ChromeHeadless {
    @Test
    public void headless(){
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver= new ChromeDriver(options);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    }
}
