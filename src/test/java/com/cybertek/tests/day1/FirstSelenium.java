package com.cybertek.tests.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/myensulukhaval/Documents/selenium dependencies/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com");


    }
}
