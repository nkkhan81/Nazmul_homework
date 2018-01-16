package hw_selenium_BasicTestScenario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * Created by nkkhan on 1/15/18.
 */
public class DriverWrapperFirefox {

    private static WebDriver driver = null;
    private static String url = "https://www.google.com/";

    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public void DriverInitialization(){

        //set firefox(gecko) driver
        System.setProperty("webdriver.gecko.driver","/Users/nkkhan/Projects/technoSoft/webDrivers/geckodriver");

        //initialize webdriver interface
        this.driver = new FirefoxDriver();

        //goto url: www.facebook.com
        driver.navigate().to(url);
    }

    @AfterClass
    public void tearDown(){
        //quit the web driver
        driver.quit();
    }
}
