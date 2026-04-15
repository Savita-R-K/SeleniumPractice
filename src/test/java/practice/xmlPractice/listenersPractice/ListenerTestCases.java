package practice.xmlPractice.listenersPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ListenerTestCases {
    WebDriver driver;

    @Test
    public void failedTest() {
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        Assert.assertTrue(false);
    }

    @Test
    public void successfulTest() {
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }

}