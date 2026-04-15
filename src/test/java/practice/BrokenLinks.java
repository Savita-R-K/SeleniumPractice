package practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

public class BrokenLinks {

    @Test
    public void brokenLinksTest() throws  IOException {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        String url=driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
        System.out.println(url);
        HttpURLConnection conn=(HttpURLConnection) new URL(url).openConnection();
        conn.setRequestMethod("HEAD");
        conn.connect();
        System.out.println(conn.getResponseCode());
    }

    @Test
    public void multipleLinksTest() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        List<WebElement> urls = driver.findElements(By.xpath("//li[@class='gf-li']/a"));

        //Soft Assertion
        SoftAssert softAssert = new SoftAssert();


        for (WebElement element : urls){
            String url = element.getAttribute("href");
            HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
            con.setRequestMethod("HEAD");
            con.connect();
            int responseCode = con.getResponseCode();
            System.out.println(responseCode);

            softAssert.assertTrue(responseCode<400,"The link " + url + " is broken link with status code " + responseCode);
        }

        //It will store the errors in execution time, and it doesn't throw any error, so after using assertAll() at last it will give the errors which are occurred.
        softAssert.assertAll();
    }
}
