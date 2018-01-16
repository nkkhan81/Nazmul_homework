package hw_selenium_BasicTestScenario;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by nkkhan on 1/15/18.
 */
public class VerifyPageTitleChrome extends DriverWrapperChrome {

    @Test
    public void testScenarioOne(){
        //get current current page title
        String pageTitle = getDriver().getTitle();

        //verify if url is correct
        Assert.assertEquals(pageTitle,"Facebook", "Invalid URL found");
    }
}
