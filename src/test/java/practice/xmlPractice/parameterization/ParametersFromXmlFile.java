package practice.xmlPractice.parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersFromXmlFile {
    @Parameters({"URL"})
    @Test
    public void printTestLevelURL(String url){
        System.out.println("Test Level Parameters\n"
                +"URL -"
                +url);
    }

    @Parameters({"URL","Username"})
    @Test
    public void printSuiteLevelParameters(String url,String username){
        System.out.println("Suite Level Parameters\n"
                +"URL- "
                +url
                + "\nusername - "
                +username);
    }

}
