package hw_selenium_BasicTestScenario;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by nkkhan on 1/15/18.
 */
public class SampleTestNGScenarioFirefox extends DriverWrapperFirefox {

    @Test
    public void testScenarioOne(){
        //get current url
        String currentURL = getDriver().getCurrentUrl();

        //verify if url is correct
        Assert.assertEquals(currentURL,"https://www.google.com/", "Invalid URL found");
    }
}
