package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DeleteCookiesUsingManage {
    @Test
    public void deleteAllCookies(){
        WebDriver driver=new ChromeDriver();
        driver.get("url");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    @Test
    public void deleteSpecificCookies(){
        //can be used to verify whether the user is logged out from app/site after deleting the session key
        //login to site->delete session key->verify user is on login page(logged out)
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("url");
        driver.manage().deleteCookieNamed("session key");
    }
}
