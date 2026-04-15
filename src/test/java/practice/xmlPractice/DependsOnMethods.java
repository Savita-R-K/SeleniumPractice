package practice.xmlPractice;

import org.testng.annotations.Test;

public class DependsOnMethods {
    @Test(dependsOnMethods = "method2")
    public void method1(){
        System.out.println("method 1 is dependent on method 2");
    }

    @Test(dependsOnGroups = "Smoke")
    public void method2(){
        System.out.println("method 2");
    }
}
