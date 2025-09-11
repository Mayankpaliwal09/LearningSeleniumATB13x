package com.mayankPaliwal.ex02_Selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestSelenium15_OptionClasses  {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
//        options.addArguments("--dark-mode-settings");
//        options.addArguments("--window-size=800,600");
        options.addArguments("--start-maximized");
//        options.addArguments("--incognito");
//        options.addArguments("--guest");


        // FirefoxOptions, ChromeOptions, SafariOptions

        // EdgeOptions -> It will help you set the browser
        // options to browsers
        // window - size
        // headless mode - there is not UI -> advantage - Fast Execution
        // full UI mode - default - UI browser
        // incognito mode - switch
        // start Max
        // add extensions - browsers
        // 100 + others , https , http
        // localstorage, download ?

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://google.com");
        System.out.println(driver.getTitle());


        driver.quit();

    }
}
