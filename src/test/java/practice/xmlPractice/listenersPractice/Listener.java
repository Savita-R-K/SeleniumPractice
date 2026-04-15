package practice.xmlPractice.listenersPractice;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;


public class Listener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test Started");
//        ITestListener.super.onTestStart(result);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Executed");
//        ITestListener.super.onTestSuccess(result);
    }

    @Override
    public void onTestFailure(ITestResult result) {
        Object testClass = result.getInstance();
        WebDriver driver = ((ListenerTestCases) testClass).driver;
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(src,new File("screenshots/listenersFailedTestcase.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Test Failed-Screenshot attached -> screenshots/listenersFailedTestcase.png");
//        ITestListener.super.onTestFailure(result);
    }
}
