package practice.chromeOptions;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ProxyWebsite {

    @Test
    public void setCapabilitiesProxy(){
        Proxy proxy = new Proxy();
        //ipaddress:port number
        proxy.setHttpProxy("51.158.68.68:8811");
        //authentication
        //proxy.setSslProxy("51.158.68.68:8811");
        ChromeOptions options = new ChromeOptions();
        options.setProxy(proxy);

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://httpbin.org/ip");
    }

}
