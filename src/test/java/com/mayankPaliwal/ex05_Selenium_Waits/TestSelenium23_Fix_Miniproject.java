package com.mayankPaliwal.ex05_Selenium_Waits;

import com.mayankPaliwal.utils.CommonToAll;
import com.mayankPaliwal.utils.CommonToAll.*;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium23_Fix_Miniproject extends CommonToAll {

    // Locators - Find the Web elements
    // Open the URL .app.vwo.com/#/login](https://app.vwo.com/#/login)
    //Find the Email id** and enter the email as admin@admin.com
    //Find the pass inputbox** and enter passwrod as admin.
    //Find and Click on the submit button
    // Wait - Thread.sleep - Repleace with EW
    //Verify that the error message is shown "Your email, password, IP address or location did not match"

    @Description("TC#1 Verify the invalid login , error messaege is displayed")
    @Owner("Mayank Paliwal")
    @Test
    public void test_vwo_inalid_login(){

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://app.vwo.com");

//        driver.manage().window().maximize();

        // Step 1 - Find the EMAIL ID and enter the admin@admin.com.
        // Step 2 - Find the Password  and enter the 1234.
        // Step 3 - Find the Submit  and click on the button.
        // Step 4 - Wait some time.
        // Step 5 - Verify the message error message.

        // Step 1 - Find the EMAIL ID and enter the admin@admin.com.

        // Step 1 - Find the EMAIL ID and enter the admin@admin.com.
        // <input open Tag
        // type="email"
        // class="text-input W(100%)"
        // name="username"
        // id="login-username"
        // data-qa="hocewoqisi"
        // data-gtm-form-interact-field-id="0"
        // > close Tag

        // Step 1 - Find the EMAIL ID and enter the admin@admin.com.

        WebElement email_input_box = driver.findElement(By.id("login-username"));
        email_input_box.sendKeys("admin@admin.com");



        // Step 2 - Find the Password  and enter the 1234.

        // 2. Find the password inputbox and enter the password

        // <input
        // type="password"
        // class="text-input W(100%)"
        // name="password"
        // id="login-password"
        // data-qa="jobodapuxe">

        WebElement input_password = driver.findElement(By.name("password"));
        input_password.sendKeys("1234");


        // Step 3 - Find the submit button  and click

//        <button
//        type="submit"
//        id="js-login-btn"
//        class="btn btn--primary btn--inverted W(100%) H(48px) Fz(16px)"
//        onclick="login.login(event)"
//        data-qa="sibequkica">

        WebElement btn_submit = driver.findElement(By.id("js-login-btn"));
        btn_submit.click();


        // Step 4 - Wait some time.

//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            System.out.println(e.getMessage());
//        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        // Max time - 3
        // condition - ?
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("notification-box-description")));


        // Step 5 - verify the error message
        // Step 5 - Verify the message error message.
        // <div
        // class="notification-box-description"
        // id="js-notification-box-msg"
        // data-qa="rixawilomi">
        // Your email, password, IP address or location did not match</div>

        WebElement err_msg = driver.findElement(By.className("notification-box-description"));
        System.out.println(err_msg.getText());
        System.out.println(err_msg.getDomAttribute("data-qa"));


        // now we assert to verify the error message
        Assert.assertEquals(err_msg.getText(),"Your email, password, IP address or location did not match");


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        // Repalced by explicit wait

        WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(3));
        wait2.until(ExpectedConditions.titleIs("Login - VWO"));


        driver.quit();
    }

}
