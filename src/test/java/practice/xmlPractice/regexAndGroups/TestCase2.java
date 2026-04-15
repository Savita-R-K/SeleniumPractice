package practice.xmlPractice.regexAndGroups;

import org.testng.annotations.Test;

public class TestCase2{
    @Test
    public void Web1(){
        System.out.println("Web1:TestCase2");
    }
    @Test(groups = {"Smoke","Regression"})
    public void Web2(){
        System.out.println("Web2:TestCase2");
    }
    @Test
    public void Mobile1(){
        System.out.println("Mobile1:TestCase2");
    }

    @Test(groups = "Regression")
    public void Mobile2() {
        System.out.println("Mobile2:TestCase2");
    }
    @Test
    public void API1(){
        System.out.println("API1:TestCase2");
    }
}
