package practice.newseleniumfeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocators {

    WebDriver driver=new ChromeDriver();

    @Test
    public void aboveBelowLeftOfRightOf(){
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");

        //-------------------above--------------------//
        WebElement nameInputBox=driver.findElement(By.xpath("//div/input[@name='name']"));
        System.out.println(driver.findElement(with(By.tagName("label")).above(nameInputBox)).getText());

        //-------------------below-------------------//
        WebElement dobLabel=driver.findElement(By.cssSelector("label[for='dateofBirth']"));
        //expected date of birth input but it is a flex element so unable to locate using relative locators, instead next input tag -"submit" is found
        System.out.println(driver.findElement(with(By.tagName("input")).below(dobLabel)).getAttribute("type"));

        WebElement studentLabel=driver.findElement(By.cssSelector("label[for='inlineRadio1']"));
        //-------------------toLeftOf-------------------//
        System.out.println(driver.findElement(with(By.name("inlineRadioOptions")).toLeftOf(studentLabel)).getAttribute("id"));
        //-------------------toRightOf-------------------//
        System.out.println(driver.findElement(with(By.name("inlineRadioOptions")).toRightOf(studentLabel)).getAttribute("id"));


    }
}
