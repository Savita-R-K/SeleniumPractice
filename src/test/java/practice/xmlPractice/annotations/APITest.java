package practice.xmlPractice.annotations;

import org.testng.annotations.*;

public class APITest {
    //AfterTest in APITest - Independent of which class it is written, If APITest class is included in any of the test It executes after all the classes in the test
    @AfterTest
    public void AT(){
        System.out.println("AfterTest in APITest");
    }

    //AfterClass executes after executing all the methods od this class which are included in the test.xml
    @AfterClass
    public void AC() {
        System.out.println("AfterClass in APITest");
    }
    //Before Method is executed before all the methods in this class which are included in the test.xml
    @BeforeMethod
    public void BM(){
        System.out.println("Before Method in APITest");
    }
    @Test
    public void day1(){
        System.out.println("APITest Day1");
    }

    @Test
    public void day2(){
        System.out.println("APITest Day2");
    }



}
