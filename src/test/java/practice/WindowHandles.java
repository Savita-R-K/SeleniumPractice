package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class WindowHandles {
    @Test
    public void windowHandling(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
        driver.manage().window().maximize();
        driver.findElement(By.className("blinkingText")).click();

        Set<String> windows= driver.getWindowHandles();
        Iterator<String> it=windows.iterator();

        String parentWindow=it.next();
        String childWindow=it.next();
        driver.switchTo().window(childWindow);

        while (it.hasNext()){
            //it.hasNext() becomes false, because it.next() has already used twice above to declare parent and child window
            System.out.println(it.next());
        }

        driver.findElement(By.xpath("//a[contains(@class,'register-btn')]")).click();
        System.out.println("completed.....");
    }
}
