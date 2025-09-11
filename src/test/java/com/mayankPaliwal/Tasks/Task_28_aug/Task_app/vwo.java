package com.mayankPaliwal.Tasks.Task_28_aug.Task_app;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class vwo {

    @Description("TC#1 Verifying the invalid email message")
    @Owner("Mayank Paliwal")
    @Test
    public void test_VWO(){

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://app.vwo.com/");


//        <a href="https://vwo.com/free-trial/?utm_medium=website&amp;utm_source=login-page&amp;utm_campaign=mof_eg_loginpage"
//        class="text-link Td(n)"
//        data-qa="bericafeqo"
//        >


        // STEP 1 - CLICK ON LINK "START FREE TRIAL"

        WebElement link_text = driver.findElement(By.linkText("Start a free trial"));
        link_text.click();

        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));



        // STEP 2 - FIND INPUT AND TYPE email= ABC

//        <input
//        class="W(100%) Py(14px)
//        input-text"
//        placeholder="name@yourcompany.com"
//        type="email"
//        id="page-v1-step1-email"
//        name="email"
//        data-qa="page-su-step1-v1-email"
//        required="">

//        WebElement email = driver.findElement(By.name("email"));
        WebElement email = driver.findElement(By.id("page-v1-step1-email"));
        email.sendKeys("abc");


        // STEP - 3 click on checkbox - agree to terms

        WebElement checkbox_policy = driver.findElement(By.name("gdpr_consent_checkbox"));
        checkbox_policy.click();


        // step - 4  click on button = "create free trial account"
        WebElement create_trial_accnt_btn = driver.findElement(By.tagName("button"));
        create_trial_accnt_btn.click();


        // step -4 verify the error message
        WebElement err_msg = driver.findElement(By.className("invalid-reason"));
        System.out.println(err_msg.getText());


         driver.quit();
    }
}
