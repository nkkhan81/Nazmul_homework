package hw_selenium_BasicTestScenario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;

/**
 * Created by nkkhan on 1/14/18.
 */
public class BasicTestScenario {
    public static void main(String[] args) {

        //set chrome driver
//        System.setProperty("webdriver.chrome.driver","/Users/nkkhan/Projects/technoSoft/webDrivers/chromedriver");

        //set safari driver
//        System.setProperty("webdriver.safari.driver","/Users/nkkhan/Projects/technoSoft/webDrivers/SafariDriver.safariextz");

        //set firefox(gecko) driver
//        System.setProperty("webdriver.gecko.driver","/Users/nkkhan/Projects/technoSoft/webDrivers/geckodriver");

        //initialize webdriver interface
//        WebDriver chromeDriver = new ChromeDriver();
        WebDriver safariDriver = new SafariDriver();
//        WebDriver geckoDriver = new FirefoxDriver();

        String url = "https://www.facebook.com/";

        //goto url: www.facebook.com
//        chromeDriver.navigate().to("https://www.facebook.com");
        safariDriver.navigate().to("https://www.facebook.com");
//        geckoDriver.navigate().to("https://www.google.com");

        //get current url
//        String currentURL = chromeDriver.getCurrentUrl();
        String currentURL = safariDriver.getCurrentUrl();
//        String currentURL = geckoDriver.getCurrentUrl();

        //verify if url is correct
        Assert.assertEquals(currentURL,url, "Invalid URL found");

        //quit the selenium driver
//        chromeDriver.quit();
        safariDriver.quit();
//        geckoDriver.quit();
    }
}
