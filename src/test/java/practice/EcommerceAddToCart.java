package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class EcommerceAddToCart {
    @Test
    public void addToCartOptimized(){
        //Add products to cart and verify the cart list contains all the items
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        String addToCartList[]={"Cucumber","Carrot","Beans"};
        int j=0;
        //add products to cart
        List<WebElement> productList=driver.findElements(By.cssSelector("div[class='product']"));

        //code optimization: avoiding looping over products after adding all the list elements are added to cart
        for(WebElement product:productList){
            if(Arrays.asList(addToCartList).contains(product.findElement(By.cssSelector("h4")).getText().split("-")[0].trim())){
                product.findElement(By.cssSelector("button")).click();
                j++;
            }
            if(j== addToCartList.length){
                break;
            }
        }
    }
    @Test
    public void addToCart(){
        //Add products to cart and verify the cart list contains all the items
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        String addToCartList[]={"Cucumber","Carrot","Beans"};

        //add products to cart
        List<WebElement> productList=driver.findElements(By.cssSelector("div[class='product']"));
        productList.stream()
                .filter(product-> Arrays.asList(addToCartList).contains(product.findElement(By.cssSelector("h4")).getText().split("-")[0].trim()))
                .forEach(product->product.findElement(By.cssSelector("button")).click());

        //verifying cart items
        driver.findElement(By.cssSelector("a[class='cart-icon']")).click();
        List<WebElement> cartItems=driver.findElements(By.cssSelector("li[class='cart-item']"));
        cartItems.stream()
                .filter(item->Arrays.asList(addToCartList).contains(item.findElement(By.cssSelector("p[class='product-name']")).getText().split("-")[0].trim()))
                .forEach(item->System.out.println(item.findElement(By.cssSelector("p[class='product-name']")).getText()));
    }
}