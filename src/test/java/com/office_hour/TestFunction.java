package com.office_hour;

import java.time.Duration;
import java.util.NoSuchElementException;


import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;


public class TestFunction {
    public static void main(String[] args) throws InterruptedException {


//here I set up the system
        WebDriverManager.chromedriver().setup();
        //here used interface element to call chrome
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");
        driver.findElement(By.xpath("//button[text()='Start']")).click();

        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
        //ignoring: This method lists the exception that you want to skip when the timeouts.
        //polling: This method sets the frequency of condition should be evaluated. The default polling interval is FIVE_HUNDRED_MILLIS.


        WebElement foo=wait.until(new Function<WebDriver, WebElement>() {

            public WebElement apply(WebDriver driver) {

                if(driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed()){
                    return driver.findElement(By.cssSelector("[id='finish'] h4"));
                }
                else{
                    return null;
                }
            }
        });

        System.out.println(driver.findElement(By.cssSelector("[id='finish'] h4")).getText());

    }
}
