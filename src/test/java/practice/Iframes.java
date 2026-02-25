package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Iframes {

    @Test
    public void frames(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
        Actions a =new Actions(driver);
        WebElement src=driver.findElement(By.id("draggable"));
        WebElement dest=driver.findElement(By.id("droppable"));
        a.dragAndDrop(src,dest).build().perform();
        driver.switchTo().defaultContent();
    }

}
