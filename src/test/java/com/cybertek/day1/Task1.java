package com.cybertek.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task1 {
    public static void main(String[] args) {
        //◈ Create a new class called Task1
        //◈ Launch Chrome and navigate to : https://www.cybertekschool.com/
        //◈ Launch Firefox and navigate to : http://www.practice.cybertekschoool.com/

        System.setProperty("webdriver.chrome.driver",
                            "/Users/myensulukhaval/Documents/selenium dependencies/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://cybertekschool.com/");

        System.setProperty("webdriver.firefox.driver",
                            "/Users/myensulukhaval/Documents/selenium dependencies/drivers/geckodriver");

        WebDriver driver2 = new FirefoxDriver();
        driver2.get("http://www.practice.cybertekschoool.com/");


    }
}
