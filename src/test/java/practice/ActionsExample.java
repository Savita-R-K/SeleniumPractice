package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class ActionsExample {
    @Test
    public void actionClass(){
        WebDriver driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Actions a=new Actions(driver);

        WebElement textBox= driver.findElement(By.id("autocomplete"));
        a.moveToElement(textBox).click().keyDown(Keys.SHIFT).sendKeys("hello").keyUp(Keys.SHIFT).doubleClick().keyDown(Keys.DELETE).build().perform();

        WebElement openWindowBtn= driver.findElement(By.xpath("//button[@id='openwindow']"));
        a.moveToElement(openWindowBtn).click().perform();

        WebElement hoverOver=driver.findElement(By.id("mousehover"));
        WebElement topOpt= driver.findElement(By.xpath("//a[text()='Top']"));
        a.moveToElement(hoverOver).click().moveToElement(topOpt).click().build().perform();
    }
}
