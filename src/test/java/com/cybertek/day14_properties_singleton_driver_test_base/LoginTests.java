package com.cybertek.day14_properties_singleton_driver_test_base;

import com.pages.LoginPage;
import com.utilities.ConfigurationReader;
import com.utilities.TestBase;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {
    LoginPage loginPage = new LoginPage();

    @Test
    public void loginTests1(){
        //DEMO for reading credentials from properties file
        String username = ConfigurationReader.getProperty("storemanagerusername");
        String password = ConfigurationReader.getProperty("storemanagerpassword");
        loginPage.login(username, password);
    }
}
