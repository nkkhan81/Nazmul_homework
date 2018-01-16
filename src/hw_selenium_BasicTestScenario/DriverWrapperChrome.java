package hw_selenium_BasicTestScenario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * Created by nkkhan on 1/15/18.
 */
public class DriverWrapperChrome {

    private static WebDriver driver = null;
    private static String url = "https://www.facebook.com/";

    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public void DriverInitialization(){
        //set chrome driver
        System.setProperty("webdriver.chrome.driver","/Users/nkkhan/Projects/technoSoft/webDrivers/chromedriver");

        //initialize webdriver interface
        this.driver = new ChromeDriver();

        //goto url: www.facebook.com
        driver.navigate().to(url);

    }

    @AfterClass
    public void tearDown(){
        //quit the web driver
        driver.quit();
    }
}
