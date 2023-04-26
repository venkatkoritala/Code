package com.SeleniumPractice;
import org.openqa.selenium.*;
import org.testng.annotations.*;
public class SingletonDriverConfig {
    public WebDriver driver;
    DriverFactory driverInstance=DriverFactory.getInstance();;
    @BeforeMethod
    public void browserSetup()
    {




    }
    @Test
    public void test1(){
        driver=driverInstance.setupDriver("chrome");
        driver.get("https://www.google.com");
        driver.quit();

    }
    @Test
    public void test2(){
        driver=driverInstance.setupDriver("firefox");
        driver.get("https://www.google.com");
        driver.close();

    }

}
