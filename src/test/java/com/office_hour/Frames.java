package com.office_hour;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
public class Frames {
    static WebDriver driver = Driver.getDriver();
    @Test
    public void iframeTest1(){
        driver.get("http://practice.cybertekschool.com/iframe");
        //we can switch to the frame by index, id/name, webelement.
        driver.switchTo().frame("mce_0_ifr");//jump into the frame
        driver.findElement(By.id("tinymce")).clear();
        driver.findElement(By.id("tinymce")).sendKeys("Test Automation");
        driver.switchTo().defaultContent();//quit from the frame
        //people use frames to insert on html document inside another one
        //for example ad banner
    }
}