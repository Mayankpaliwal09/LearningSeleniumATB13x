package com.mayankPaliwal.ex17_DataDrivenTesting_POI;

import com.mayankPaliwal.utils.CommonToAll;
import  com.mayankPaliwal.utils.UtilExcel;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Lab50_DDT_TestNG_POI_REAL extends CommonToAll {

   @Test(dataProvider="getData")
   @Description("Negative testcase loginVWO Error check using Data driven by Excel file")
    public void test_loginVWO_invalid(String email , String Password){

       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://app.vwo.com");

       System.out.println(driver.getTitle());

       Assert.assertEquals(driver.getTitle(), "Login - VWO");
       Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");


       // 1. Find the email inputbox and enter the email
       WebElement emailInputBox = driver.findElement(By.id("login-username"));
       emailInputBox.sendKeys(email);


       WebElement passwordInputBox = driver.findElement(By.name("password"));
       passwordInputBox.sendKeys(Password);


       WebElement buttonSubmit = driver.findElement(By.id("js-login-btn"));
       buttonSubmit.click();


       closeBrowser(driver);

   }

   @DataProvider
    public Object[][] getData(){
       return UtilExcel.getData("sheet1");
    }
}
