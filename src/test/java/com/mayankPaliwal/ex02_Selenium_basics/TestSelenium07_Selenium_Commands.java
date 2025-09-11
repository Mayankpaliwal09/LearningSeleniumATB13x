package com.mayankPaliwal.ex02_Selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium07_Selenium_Commands {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        System.out.println( driver.getTitle());
        System.out.println( driver.getCurrentUrl());
        System.out.println( driver.getPageSource());


        // When you are done with browser
        // you want to close all the tabs and browser
        driver.quit();

    }
}
