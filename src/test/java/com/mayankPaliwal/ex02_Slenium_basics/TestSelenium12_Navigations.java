package com.mayankPaliwal.ex02_Slenium_basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium12_Navigations {

    @Description("open the URL")
    @Test
    public void test_selenium(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com"); // 95%


        // Use Navigation Commands
        //driver.get("url") -> navigate to url

        // navigate.to()
         driver.navigate().to("https://bing.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().to("https://stackoverflow.com");
         driver.navigate().forward();

    }
}
