package com.mayankPaliwal.ex02_Slenium_basics;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class TestSelenium03 {
    // start and stop itself.
    //  If it was a Selenium 3, then we have to do this.

    //System.getProperty("webdriver.gecko.driver","/path/geckdriver");



    // In selenium 4 there was a selenium driver manager who automatcally set the driver path

    @Test
    public void test(){
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://google.com");


//
//        InternetExplorerDriver ie = new InternetExplorerDriver();
//        ie.get("https://google.com");

//
//        SafariDriver sd = new SafariDriver();
//        sd.get("https://google.com");


        // You need to setup the Driver(browser)


    }

}
