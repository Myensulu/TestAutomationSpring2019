package com.office_hour;

import com.utilities.SeleniumUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class CaptureScreenShot {
    WebDriver driver;
    String userNameLocator="//input[@id='login']";
    String passwordLocator = "//input[@id='password']";
    String LoginLocator="//button[@class='btn btn-primary']";
    @Test
    public void takescreenshot() throws IOException {
        WebDriverManager.chromedriver().setup();
        //here used interface element to call chrome
        driver=new ChromeDriver();
        //I insert implicitly wait in order to handle all kind of the NoSuchElementFound exceptions
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //Here I used to maximize method to Maximize the opening website
        driver.manage().window().maximize();
        //here send the webadress link
        driver.get("http://34.220.250.213/web/login");
        SCUtilities.captureScreenShot(driver, "LoginBriteErp");
        WebElement usernameField = driver.findElement(By.xpath(userNameLocator));
        //Put value into the username inputbox
        usernameField.sendKeys("Learning to take the screenSot");
        // find the Web element for the password inputbox
        WebElement passwordField = driver.findElement(By.xpath(passwordLocator));
        //Put value into the password inputbox
        passwordField.sendKeys("eventscrmmanager");
        // wait for 2 seconds
        SCUtilities.captureScreenShot(driver, "AfterPass");
        SeleniumUtils.waitPlease(2);
        //find the Web element for login button and click/submit it
        driver.findElement(By.xpath(LoginLocator)).submit();
        SCUtilities.captureScreenShot(driver, "LoginButton");
        SeleniumUtils.waitPlease(2);


    }
}