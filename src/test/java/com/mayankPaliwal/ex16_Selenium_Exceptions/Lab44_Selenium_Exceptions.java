package com.mayankPaliwal.ex16_Selenium_Exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab44_Selenium_Exceptions {


    @Test
    public void test_Selenium_no_suchException(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");

        driver.findElement(By.id("Mayank"));

        //org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"#Mayank"}
        //  (Session info: chrome=140.0.7339.208)
    }
}
