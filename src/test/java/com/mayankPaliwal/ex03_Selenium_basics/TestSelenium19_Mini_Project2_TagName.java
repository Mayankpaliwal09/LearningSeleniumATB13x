package com.mayankPaliwal.ex03_Selenium_basics;

import com.mayankPaliwal.utils.CommonToAll;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium19_Mini_Project2_TagName extends CommonToAll {

    @Owner("Mayank")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Verify that the error message comes with invalid email or signup")
    @Test
    public void vwo_free_trial_error_verify() {

//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://app.vwo.com");


        openBrowser("https://app.vwo.com" , "chrome" );

//        WebElement partial_text_satrt_free_trial = driver.findElement(By.partialLinkText("free"));
//        partial_text_satrt_free_trial.click();



         WebElement partialText =   partialText("free");

        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));

        WebElement email = driver.findElement(By.id("page-v1-step1-email"));
        email.sendKeys("abc");

        WebElement checkbox = driver.findElement(By.name("gdpr_consent_checkbox"));
        checkbox.click();

        WebElement button = driver.findElement(By.tagName("button"));
        button.click();

        WebElement error_msg = driver.findElement(By.className("invalid-reason"));

        Assert.assertEquals(error_msg.getText(),"The email address you entered is incorrect.");

         closeBrowser(driver);

    }
}
