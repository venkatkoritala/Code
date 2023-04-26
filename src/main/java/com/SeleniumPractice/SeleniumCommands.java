package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumCommands {
    public WebDriver driver;
     @BeforeMethod
    public void driverSetup()
     {
         //WebDriverManager.chromedriver().setup();
         driver=new SafariDriver();
     }
     @Test
    public void test()
     {
        driver.get("https://google.com");
         Actions action=new Actions(driver);
         action.click(driver.findElement(By.id(""))).perform();


     }

}
