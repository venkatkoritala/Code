package com.SeleniumPractice;
import org.openqa.selenium.*;
import org.testng.annotations.*;
public class SingletonDriverConfig {
    public WebDriver driver;
    @BeforeTest
    public void browserSetup()
    {
        DriverFactory driverInstance=DriverFactory.getInstance();
        driver=driverInstance.setupDriver();


    }
    @Test
    public void test1(){
        driver.get("https://www.google.com");

    }

}
