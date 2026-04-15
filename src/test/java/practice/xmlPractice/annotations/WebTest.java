package practice.xmlPractice.annotations;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebTest {
    //BeforeSuite Executes Before all the tests in the xml file
    @BeforeSuite
    public void BS(){
        System.out.println("BeforeSuite in WebTest");
    }

    //Before Test execute before all the classes in the test tag where WebTest is included
    @BeforeTest
    public void BT(){
        System.out.println("BeforeTest in WebTest");
    }
    @Test
    public void day1(){
        System.out.println("WebTest Day1");
    }
    @Test
    public void day2(){
        System.out.println("WebTest Day2");
    }

}
