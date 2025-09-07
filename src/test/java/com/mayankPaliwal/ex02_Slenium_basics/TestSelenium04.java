package com.mayankPaliwal.ex02_Slenium_basics;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.sql.Driver;

public class TestSelenium04 {
    public static void main(String[] args) {

        // Webdriver hierarchy

        //SearchContext(Interface) -> [2] -> searchElement,  searchElements ->
        // ->  Webdriver (I) -> [10]  -->
        // RemoteWebDriver(class) -> [15]
        //        //
        // -> ChromiumDriver(C) 25 ->
        //          EdgeDriver(C) (45), ChromeDriver

        // SearchContext - Interface - findElement, and findElements - GGF
        // WebDriver - Interface - some incomplete functions - GF
        // RemoteWebDriver - Class- It also has some functions - F
        // ChromeDriver, FirefoxDriver, EdgeDriver, SafariDriver, InternetExplorerDriver  Class - S

//        SearchContext driver = new EdgeDriver();  // here only 2 fun vailable -> findElement . findElements
//        SearchContext driver1 = new FirefoxDriver();
//        SearchContext driver2 = new InternetExplorerDriver();


        // here we access lot of functions
        // this is also called dynamic dispatch

//        WebDriver driver = new ChromeDriver();
//        RemoteWebDriver driver1 = new ChromeDriver();
//        ChromeDriver  driver2 = new ChromeDriver();


        // Scenarios

        // 1. Do want to run on  Chrome or Edge? (1-2%)

        ChromeDriver driver = new ChromeDriver();
//        driver = new EdgeDriver() //  we cannot change driver to edge
// here we cn only use 1 either chrome or edge


        // 2  Do you want to run on Chrome then switch/change to Edge ? (96%)

        WebDriver driver1 = new ChromeDriver();
        driver1 = new EdgeDriver();


        // 3. Do you want to run on multiple browsers, aws machine? 2%
        // RemoteWebDriver driver (with GRID) - Advance (Last 2 Sessions)



    }
}
