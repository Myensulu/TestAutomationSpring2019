package com.cybertek.tests.day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//WARM UP ASSIGNMENT
//        1: DRIVER FACTORY1.Create class BrowserFactory.
//        2.Create a public static method getDriver which takes a string argument.
//        3.if argument is equal to chrome, method should return new ChromeDriverobject.
//          If argument is equal to firefox method should return new FirefoxDriver.
//          Return null in all other cases.
//        4.Create a different class to test the BrowserFactory class.
//
public class BrowserFactory {
    //it's not main method
    //it's a method that returns object of webdriver
    //it can be firefox of chrome based on value of parameter
    //again, we create method to reuse a code
    //remember, if some code must be used at least twice
    //create method for this code
    //don't duplicate same code again and again

    public static WebDriver getDriver(String browser){
        if(browser.equals("chrome")){
            //we need to specify properties for chromedriver
            //otherwise, selenium will not know where to find chromedriver
            //1st param is webdriver type
            //2nd param is for path to the web driver
            //it's required by selenium web driver to interact with web browser
            System.setProperty("webdriver.chrome.driver",
                               "/Users/myensulukhaval/Documents/selenium dependencies/drivers/chromedriver");
            return new ChromeDriver();
        }else if(browser.equals("firefox")){
            System.setProperty("webdriver.gecko.driver",
                               "/Users/myensulukhaval/Documents/selenium dependencies/drivers/geckodriver");
            return new FirefoxDriver();
        }else{
            return null;
        }
    }
}
