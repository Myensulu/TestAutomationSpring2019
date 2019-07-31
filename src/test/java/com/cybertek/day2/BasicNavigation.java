package com.cybertek.day2;

import org.openqa.selenium.WebDriver;

public class BasicNavigation {
    public static void main(String[] args) throws Exception{
        WebDriver driver = BrowserFactory.getDriver( "chrome");

        driver.manage().window().maximize();

        driver.get("http://google.com");
        Thread.sleep(1000);

        driver.get("http://amazon.com");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);

        System.out.println("Title: "+driver.getTitle());
        System.out.println("URL: "+driver.getCurrentUrl());
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.close();
    }
}
