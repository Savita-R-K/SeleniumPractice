package practice.newseleniumfeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ElementDimensions {
    @Test
    public void getHeightWidthOfElement(){
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        WebElement searchBox = driver.findElement(By.id("APjFqb"));
        searchBox.sendKeys("Expedia");
        System.out.println(searchBox.getRect().getDimension().getHeight());
        System.out.println(searchBox.getRect().getDimension().getWidth());
    }

    @BeforeClass
    public void before() {
        System.out.println("I execute before class");
    }
    @AfterClass
    public void after() {
        System.out.println("I execute before class");
    }

}
