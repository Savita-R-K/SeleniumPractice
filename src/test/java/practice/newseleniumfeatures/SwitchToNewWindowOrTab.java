package practice.newseleniumfeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Iterator;

public class SwitchToNewWindowOrTab {
    WebDriver driver=new ChromeDriver();
    @Test
    public void switchToNewTab(){
        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/angularpractice/");

        driver.switchTo().newWindow(WindowType.TAB);

        Iterator<String> it=driver.getWindowHandles().iterator();
        String parentTab= it.next();
        String childTab= it.next();

        driver.switchTo().window(childTab);
        driver.get("https://rahulshettyacademy.com/practice");
        //get some text from child window and type it in parent tab
        String name=driver.findElements(By.cssSelector("div[class*='flex-col'] h3")).get(0).getText();

        driver.switchTo().window(parentTab);
        driver.findElement(By.xpath("//div/input[@name='name']")).sendKeys(name);

        driver.quit();
    }

    @Test
    public void switchToNewWindow(){
        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/angularpractice/");

        driver.switchTo().newWindow(WindowType.WINDOW);

        Iterator<String> it=driver.getWindowHandles().iterator();
        String parentTab= it.next();
        String childTab= it.next();

        driver.switchTo().window(childTab);
        driver.get("https://rahulshettyacademy.com/practice");
        //get some text from child window and type it in parent tab
        String name=driver.findElements(By.cssSelector("div[class*='flex-col'] h3")).get(0).getText();

        driver.switchTo().window(parentTab);
        driver.findElement(By.xpath("//div/input[@name='name']")).sendKeys(name);

        driver.quit();
    }
}
