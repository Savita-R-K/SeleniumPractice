package practice.xmlPractice;

import org.testng.annotations.Test;

public class TurnOffTestCases {
    @Test(enabled = false)
    public void failedTestCase(){
        System.out.println("Skipping Failed/error causing Test cases");
    }

    @Test()
    public void testCase(){
        System.out.println("Test case");
    }

}
