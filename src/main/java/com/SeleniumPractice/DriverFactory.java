package com.SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    private static DriverFactory driverInstance=null;
    private WebDriver driver;
    private DriverFactory(){

    }
    public WebDriver setupDriver(String browser)
    {
        if(browser=="chrome")
        driver=new ChromeDriver();
        else
            driver=new FirefoxDriver();
        return driver;
    }
    public static DriverFactory getInstance(){
        if(driverInstance==null)
            driverInstance=new DriverFactory();
        return driverInstance;
    }
}
