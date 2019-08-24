package com.cybertek.tests.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    public static void main(String[] args) throws Exception{

        // this line replaces System.setProperty()
        WebDriverManager.chromedriver().setup(); //setup WebDriver
        WebDriver driver = new ChromeDriver();  // create object of chrome driver
        driver.manage().window().maximize();  // open browser maximized
        driver.get("http://practice.cybertekschool.com/forgot_password"); // open url

        WebElement emailInputBox = driver.findElement(By.name("email"));  // we found input box
        WebElement submitButton = driver.findElement(By.id("form_submit")); // we found element by id

        emailInputBox.sendKeys("email@gamil.com"); //to enter text
        Thread.sleep(2000); // waiting 2 seconds

        submitButton.click(); // we r clicking submit button
        Thread.sleep(2000);

        // let's find confirmation message and verify it
        WebElement confirmationMessage = driver.findElement(By.name("confirmation_message"));

        String expectedMessage = "Your e-mail's been sent!";
        String actualMessage = confirmationMessage.getText(); // to get text of element

        // we verify that expected message is same as on the page
        if (actualMessage.equals(expectedMessage)){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
            System.out.println("Expected message: "+expectedMessage);
            System.out.println("Actual message: "+ actualMessage);
        }

        driver.close(); //selenium clean up after yourself,close browser

    }
}
