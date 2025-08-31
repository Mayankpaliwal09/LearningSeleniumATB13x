package com.mayankPaliwal.ex01_Selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;

public class TestSelenium01 {

    @Test
    public void test_code(){
        Assert.assertEquals("mayank","mayank");
    }


    @Test
    public void test_OpenTheGoogleCom(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        driver.close();

    }
}
