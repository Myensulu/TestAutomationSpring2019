package com.cybertek.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test3 {
    public static void main(String[] args) throws Exception {
        // this line replaces System.setProperty("webdriver", "pah to the webdriver")
        WebDriverManager.chromedriver().setup();  // setup webdriver
        // driver will give us access to the browser
        WebDriver driver = new ChromeDriver();  // create object of chrome driver
        driver.manage().window().maximize();  // open browser maximized
        driver.get("http://practice.cybertekschool.com/forgot_password"); // open url

        WebElement emailInputBox = driver.findElement(By.name("email"));  // we found input box
        WebElement submitButton = driver.findElement(By.id("form_submit")); // we found submit button


        emailInputBox.sendKeys("sdetpro3000@gmail.com"); // to enter text into input box

        Thread.sleep(3000);
        submitButton.submit();  // it works only with buttons. Click button is more flexible

        System.out.println(emailInputBox.getAttribute("pattern")); // to read value of pattern attribute,

        Thread.sleep(3000);
        driver.close();

    }

}
