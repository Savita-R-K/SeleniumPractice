package practice.streams;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {
    WebDriver driver=new ChromeDriver();
    @Test
    public void example1(){
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

        //Click on 1st column 'veg/fruit name' heading to sort according to name
        WebElement sortByNameBtn=driver.findElement(By.xpath("//span[text()='Veg/fruit name']"));
        sortByNameBtn.click();

        //traverse through tables to collect sorted product names
        List<String> prodList=getListOfAllTheProductsUsingNextBtn();

        //sort prodList and compare the with original prodList
        Assert.assertEquals(prodList.stream().sorted().collect(Collectors.toList()),prodList);
    }

    public List<String> getListOfAllTheProductsUsingNextBtn() {
        List<String> products=new ArrayList<>();
        while(true) {
            products.addAll(driver.findElements(By.xpath("//tr/td[1]")).stream()
                    .map(WebElement::getText)
                    .toList());
            if (dynamicNextBtn().getAttribute("aria-disabled").equalsIgnoreCase("true")) {
                break;
            }
            dynamicNextBtn().click();
        }return products;
    }

    public WebElement dynamicNextBtn(){
        return driver.findElement(By.cssSelector("a[aria-label='Next']"));
    }
}
