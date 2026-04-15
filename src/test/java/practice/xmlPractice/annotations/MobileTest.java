package practice.xmlPractice.annotations;

import org.testng.annotations.*;

public class MobileTest {
    //AfterSuite Executes After all the tests in the xml file
    @AfterSuite
    public void AS(){
        System.out.println("AfterSuite in Mobile Test");
    }

    @AfterTest
    public void AT(){
        System.out.println("AfterTest in MobileTest");
    }

    @BeforeClass
    public void BC() {
        System.out.println("Before class in MobileTest");
    }
    @Test
    public void day1(){
        System.out.println("MobileTest Day1");
    }
    @Test
    public void day2(){
        System.out.println("MobileTest Day2");
    }
}
