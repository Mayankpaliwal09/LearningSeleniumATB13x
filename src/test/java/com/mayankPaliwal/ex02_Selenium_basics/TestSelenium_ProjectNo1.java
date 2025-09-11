package com.mayankPaliwal.ex02_Selenium_basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium_ProjectNo1 {

    @Description("TC#1 verifying that text exists on Katalon website ")
    @Test
    public void test_verify_text_Katalon(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/");
        Assert.assertEquals(driver.getTitle(),"CURA Healthcare Service");
        System.out.println(driver.getPageSource());



        if(driver.getTitle().contains("CURA Healthcare Service")){
            System.out.println("Test case Passed");
            Assert.assertTrue(true,"assertion passed");
        } else {
            System.out.println("Test cases Failed !");
            Assert.fail("assertion failed");
        }


        driver.quit();
    }
}
