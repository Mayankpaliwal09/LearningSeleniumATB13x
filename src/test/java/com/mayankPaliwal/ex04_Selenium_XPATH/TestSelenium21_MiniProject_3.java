package com.mayankPaliwal.ex04_Selenium_XPATH;

import com.mayankPaliwal.ex07_WaitHelper.WaitHelpers;
import com.mayankPaliwal.utils.CommonToAll;
import com.mayankPaliwal.utils.CommonToAll.*;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium21_MiniProject_3 extends WaitHelpers {


    @Description("Verify Login is working of Katalon with valid email ,pass , appointment page is   loaded ")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Mayank Paliwal")
    @Test
    public void test_katalon_Login(){

        openBrowser("https://katalon-demo-cura.herokuapp.com/", "chrome");

        WebElement make_appointment_btn_xpath  = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
        make_appointment_btn_xpath.click();

        List<WebElement> username_input_box_xpath_placeholder = driver.findElements(By.xpath("//input[@placeholder='Username']"));
        username_input_box_xpath_placeholder.get(1).sendKeys("John Doe");

        List<WebElement> password_input_box = driver.findElements(By.xpath("//input[@placeholder='Password']"));
        password_input_box.get(1).sendKeys("ThisIsNotAPassword");

        WebElement login_input_box = driver.findElement(By.xpath("//button[@id=\"btn-login\"]"));
        // //button[text()="Login"]
        login_input_box.click();

       javaWait("3000");

        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");


        //h2[text()="Make Appointment"]
        WebElement h2 = driver.findElement(By.xpath("//h2[text()=\"Make Appointment\"]"));
        Assert.assertEquals(h2.getText(),"Make Appointment");
        Assert.assertTrue(h2.isDisplayed());





    }
}
