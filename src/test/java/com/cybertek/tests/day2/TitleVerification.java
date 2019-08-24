package com.cybertek.tests.day2;

//ASSIGNMENT2: VERIFY TITLE AND URL1.
//  1.Create a new class TitleVerification and create a main method.
//  2.Add this ArrayList declaration to the main method:
//    List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
//    "http://practice.cybertekschool.com/dropdown","http://practice.cybertekschool.com/login");
//  3.Visit all the websites and verify that they all have the same title.
//  4.Verify that all url of all com.cybertek.tests.pages start with http://practice.cybertekschool.com.NOTE:
//    Use the WebDriverFactory.

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification {
    public static void main(String[] args) throws Exception{
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                                          "http://practice.cybertekschool.com/dropdown",
                                          "http://practice.cybertekschool.com/login");

        //this expecting title for every website
        String expectedTitle = "Practice";
        String expectedURL = "http://practice.cybertekschool.com";

        WebDriver driver = BrowserFactory.getDriver("chrome");

        for(String url: urls){
            driver.get(url); // we are opening website
            Thread.sleep(2000);

            //we are checking if page title of every website is correct
            System.out.println("Verify page titles");
            if(driver.getTitle().equals(expectedTitle)){
                System.out.println("Title correct.");
                System.out.println("Passed");
            }else{
                System.out.println("Title incorrect: "+driver.getTitle());
                System.out.println("Failed");
            }
            System.out.println("verify page URL's");

            //to verify if every page url starts with expected URL
            if(driver.getCurrentUrl().startsWith(expectedURL)){
                System.out.println("URL is correct");
                System.out.println("Passed");
            }else{
                System.out.println("URL is not correct: "+driver.getCurrentUrl());
                System.out.println("Failed");
            }
        }

        driver.close();
    }
}
