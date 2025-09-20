package com.mayankPaliwal.ex03_Selenium_basics;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestSelenium18_LinkText_Partial_Text_TagName_Locators {


    @Description("Verify VWO")
    @Test
    public void test_login_vwo(){


        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://app.vwo.com");
        // <a
        // href="https://vwo.com/free-trial/?utm_medium=website&amp;utm_source=login-page&amp;utm_campaign=mof_eg_loginpage"
        // class="text-link"
        // data-qa="bericafeqo">
        // Start a free trial
        //
        //</a>


        // className yES -> But look kind of, you can say, most unique.

        //      // Link Text - Full Text Match


//        WebElement a_tag_free_trial_full_match = driver.findElement(By.linkText("Start a free trial"));
//        a_tag_free_trial_full_match.click();

        //If the element locator is invalid - no such element: Unable to locate element: {"method":"link text","selector":"Start a free tria"}

        // Start a free trial
        // Start a free
        // Start a
        // Start , Trail, free, a, Star...

        WebElement partial_text_satrt_free_trial = driver.findElement(By.partialLinkText("free"));
        partial_text_satrt_free_trial.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();


    }



}
