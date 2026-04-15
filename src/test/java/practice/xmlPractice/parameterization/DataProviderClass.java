package practice.xmlPractice.parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {

    @Test(dataProvider = "getData")
    public void dataProviderTest(String username,String password){
        System.out.println("Data Provider runs in loop,Each time with different data set");
        System.out.println(username+"\n"+password);
    }

    @DataProvider
    public Object[][] getData(){
        Object[][] obj =new Object[3][2];

        obj[0][0]="Username 1";
        obj[0][1]="Password 1";

        obj[1][0]="Username 2";
        obj[1][1]="Password 2";

        obj[2][0]="Username 3";
        obj[2][1]="Password 3";
        return obj;
    }
}
