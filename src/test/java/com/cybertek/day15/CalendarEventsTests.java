package com.cybertek.day15;

    /*
     * Verify repeat options
     * Log in as Valid user
     * Go to Activities -> Calendar Events
     * Click on create new calendar event
     * Click on Repeat checkbox
     * Verify repeat options:
     * Daily
     * Weekly
     * Monthly
     * Yearly
     */
import com.pages.CalendarEventsPage;
import com.utilities.ConfigurationReader;
import com.utilities.TestBase;
import com.utilities.VYTrackUtils;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class CalendarEventsTests extends TestBase {
    //BeforeMethod is coming from TestBase
    CalendarEventsPage calendarPage = new CalendarEventsPage();

    @Test
    public void verifyRepeatOptions(){
        //we are reading username from .properties file
        String username = ConfigurationReader.getProperty("storemanagerusername");
        //we are reading password from .properties file
        String password = ConfigurationReader.getProperty("storemanagerpassword");

        VYTrackUtils.login(driver, username, password); //login

        //go to Calendar Events
        VYTrackUtils.navigateToModule(driver, "Activities", "Calendar Events");
        //since vytrack displays overlay screen during loading of the page
        //we have wait, until that overlay screen disappear
        VYTrackUtils.waitUntilLoaderScreenDisappear(driver);
        driver.findElement(By.cssSelector(calendarPage.createCalendarEventBtnLocator)).click();

        //since vytrack displays overlay screen during loading of the page
        //we have wait, until that overlay screen disappear
        VYTrackUtils.waitUntilLoaderScreenDisappear(driver);
        driver.findElement(By.cssSelector(calendarPage.repeatCheckBoxLocator)).click();

        List<String> expectedOptions = Arrays.asList("Daily", "Weekly","Monthly", "Yearly");
        List<String> actualOptions = calendarPage.getRepeatOptions();

        //correct way to check if 2 collections are equals
        Assert.assertEquals(actualOptions, expectedOptions);

    }

    @Test
    public void DailyRepeatOptionRepeatEveryTest(){

    }


    //AfterMethod id coming from TestBase
}
