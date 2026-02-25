package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.*;

public class OpenLinksInSeparateTabs {
    @Test
    public void openLinks(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://qaclickacademy.com/practice.php");
        driver.manage().window().maximize();
        WebElement footerDriver=driver.findElement(By.cssSelector("div[id='gf-BIG']"));
        List<WebElement> footerLinks=footerDriver.findElements(By.tagName("a"));
        for(WebElement link:footerLinks){
            String openLinkKeyString=Keys.chord(Keys.CONTROL,Keys.ENTER);
            link.sendKeys(openLinkKeyString);
        }
        driver.close();//only closes the parent browser (closes once all the pages opened during the execution are loaded)
        driver.quit();//quits the parent and all the child windows opened during execution (before loading other pages opened during execution)

    }

    @Test
    public void printTitleOfAllPages() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://qaclickacademy.com/practice.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement footerDriver = driver.findElement(By.cssSelector("div[id='gf-BIG']"));
        List<WebElement> footerLinks = footerDriver.findElements(By.tagName("a"));

        for(WebElement link:footerLinks){
            String openLinkKeyString=Keys.chord(Keys.CONTROL,Keys.ENTER);
            link.sendKeys(openLinkKeyString);
        }
        Iterator<String> it=driver.getWindowHandles().iterator();
        while(it.hasNext()){
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
        }

    }
}
