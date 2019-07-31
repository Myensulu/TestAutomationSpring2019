package com.office_hour;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class SCUtilities {

    public static void captureScreenShot(WebDriver driver, String screenshotname){
        try{
            TakesScreenshot file=(TakesScreenshot)driver;
            File source=file.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(source, new File("/Users/emraypala/IdeaProjects/TestSeleniumAutomation/src/test/java/ScreenShotLibrariy/"+screenshotname+".jpg"));

        }catch(Exception e){
            System.out.println("while taking the screenshot happened the exception"+e.getMessage());
        }
    }
}
