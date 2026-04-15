package practice.chromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.Arrays;

public class BlockPopUp {
//    AcceptInsecureCerts
//    Proxy
//    Pop up blocking
//    Prefs(map)->download files to specific directory--(options.setExperimentalOptions("prefs",prefs);
    @Test
    public void popupBlocking(){
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
        WebDriver driver=new ChromeDriver(options);
        driver.get("url");

    }

}
