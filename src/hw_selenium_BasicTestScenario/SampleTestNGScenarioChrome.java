package hw_selenium_BasicTestScenario;

import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Created by nkkhan on 1/15/18.
 */
public class SampleTestNGScenarioChrome extends DriverWrapperChrome {

    @Test
    public void testScenarioOne(){
        //get current url
        String currentURL = getDriver().getCurrentUrl();

        //verify if url is correct
        Assert.assertEquals(currentURL,"https://www.google.com/", "Invalid URL found");
    }
























/*    @Test
    public void testScenarioTwo(){
    System.out.println("Sample Scenario Two");
    }


    @BeforeMethod
    public void beforeMethodAction(){
        System.out.println("I run before each method");
    }

    @AfterMethod
    public void afterMethodAction(){
        System.out.println("I run after each method");
    }*/
}
