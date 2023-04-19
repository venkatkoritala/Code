package com.SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
    private static DriverFactory driverInstance=null;
    private WebDriver driver;
    private DriverFactory(){

    }
    public WebDriver setupDriver()
    {
        driver=new ChromeDriver();
        return driver;
    }
    public static DriverFactory getInstance(){
        if(driverInstance==null)
            driverInstance=new DriverFactory();
        return driverInstance;
    }
}
