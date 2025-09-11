package com.mayankPaliwal.ex02_Selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestSelenium11_Change_Driver {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver = new EdgeDriver();

        driver.quit();
    }
}
