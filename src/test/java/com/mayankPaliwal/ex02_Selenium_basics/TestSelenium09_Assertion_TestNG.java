package com.mayankPaliwal.ex02_Selenium_basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class TestSelenium09_Assertion_TestNG {

    @Description("Verify that title is visible .")
    @Test
    public void test_Selenium_assertion(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        // TestNG Assertions
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.google.com/");


        // AssertJ Assertions
        assertThat(driver.getCurrentUrl()).isNotBlank().isNotEmpty();


        // RestAssured assertion - no we cannot use becouse we are not getting response
        // RestAssured hamcrest assertion works only on [validtable response]



        driver.quit();
    }
}
