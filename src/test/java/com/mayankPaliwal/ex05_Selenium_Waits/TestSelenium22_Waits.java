package com.mayankPaliwal.ex05_Selenium_Waits;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class TestSelenium22_Waits {

    public static void main(String[] args) {

        // IMplicit wait


        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://app.vwo.com");
        //e1,2,3

    }

}
