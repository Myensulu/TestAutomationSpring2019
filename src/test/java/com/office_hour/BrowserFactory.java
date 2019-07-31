package com.office_hour;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
    private static WebDriver driver;

    //to prevent object creation
    private BrowserFactory(){

    }
    //synchronized needs to yield threads. So we will make that during parallel execution our tests will not break
    public synchronized static WebDriver getDriver(String browser){
        if(driver != null) {
            if (browser.equals("chrome")) {
                System.setProperty("webdriver.chrome.driver", "/Users/cybertekstudio/Desktop/selenium dependecies/drivers/chromedriver");
                driver =  new ChromeDriver();
            } else if (browser.equals("firefox")) {
                System.setProperty("webdriver.gecko.driver", "/Users/cybertekstudio/Desktop/selenium dependecies/drivers/geckodriver");
                driver =  new FirefoxDriver();
            } else {
                throw new IllegalArgumentException("Wrong driver name");
            }
        }
        return driver;
    }
}
