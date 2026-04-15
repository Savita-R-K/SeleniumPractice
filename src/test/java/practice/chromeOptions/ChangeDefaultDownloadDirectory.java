package practice.chromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import java.util.HashMap;
import java.util.Map;

public class ChangeDefaultDownloadDirectory {
    @Test
    public void setCapabilitiesProxy() {

        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("download.default_directory", "/directory/path");
        options.setExperimentalOption("prefs", prefs);

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://httpbin.org/ip");
    }
}
