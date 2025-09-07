package com.mayankPaliwal.ex02_Slenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium14_Close_VS_quit {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        // write the code

        // 1st wait for sometime
        // its a java wait not selenium wait

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Close - will close the current tab, not the session (not the all tabs)
        // session id != null

//        driver.close();



        // It will close all the tabs. - session id == null
        driver.quit();





    }

}
