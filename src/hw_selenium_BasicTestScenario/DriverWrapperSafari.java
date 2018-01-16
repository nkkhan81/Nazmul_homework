package hw_selenium_BasicTestScenario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * Created by nkkhan on 1/15/18.
 */
public class DriverWrapperSafari {

    private static WebDriver driver = null;
    private static String url = "https://www.google.com/";

    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public void DriverInitialization(){
        //initialize webdriver interface
        this.driver = new SafariDriver();

        //goto url: www.facebook.com
        driver.navigate().to(url);
    }

    @AfterClass
    public void tearDown(){
        //quit the web driver
        driver.quit();
    }
}
