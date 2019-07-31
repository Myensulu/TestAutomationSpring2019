package com.cybertek.day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPageSource {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                           "/Users/myensulukhaval/Documents/selenium dependencies/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("http://practice.cybertekschool.com");
        String pageSource = driver.getPageSource(); // it reads html code of web page
        System.out.println(pageSource);
        driver.close();

    }
}
