package practice.xmlPractice;

import org.testng.annotations.Test;

public class SetTimeOut {
    //USED WHEN THE TEST IS TAKING MORE THAN DEFAULT TIMEOUT DUE TO SOME REASONS THEN SET THE Timeout as required
    @Test(timeOut = 5000)
    public void timeOutTest(){
        System.out.println("time out");
    }
}
