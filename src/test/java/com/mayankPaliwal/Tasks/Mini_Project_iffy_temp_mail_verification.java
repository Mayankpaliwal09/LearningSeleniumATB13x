package com.mayankPaliwal.Tasks;

import com.mayankPaliwal.ex07_WaitHelper.WaitHelpers;
import com.mayankPaliwal.utils.CommonToAll;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Mini_Project_iffy_temp_mail_verification extends CommonToAll {



    @Description("Verify iffy by signup and verification by Temp-email and otp")
    @Test
    public void test_iffy_Temp_email_verification(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://iffy.com/sign-up");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));


        String fname = "mayank";
        String lname = "paliwal";

        WebElement namef = FindElementbyId(driver,"firstName-field");
        namef.sendKeys(fname);
        WebElement namel =  FindElementbyId(driver,"firstName-field");
        namel.sendKeys(lname);

        // Navigate to temp_email
        // URL - https://temp-mail.org/en/

        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://temp-mail.org/en/");

        WaitHelpers.javaWait("10000");

        WebDriverWait wait2 = new WebDriverWait(driver1, Duration.ofSeconds(10));
        WebElement emailvisiblity = driver1.findElement(By.id("mail"));
        WaitHelpers.checkVisibilityOfAndTextToBePresentInElement(driver1,emailvisiblity);
        wait.until(d ->!emailvisiblity.getAttribute("value").equalsIgnoreCase("Loading.."));
        String email = emailvisiblity.getAttribute("value");
        System.out.println("temp email is "+email);

        WaitHelpers.javaWait("3000");

        // now we will fill the email
        driver.switchTo();
        WebElement email1 = FindElementbyId(driver,"emailAddress-field");
        email1.sendKeys(email);
        FindElementbyXpath(driver,"//button[.//span[text()='Continue']]").click();


        WaitHelpers.javaWait("8000");

        driver1.switchTo();
        WebElement otp = FindElementbyXpath(driver1,"//a[contains(text(),'verification')]");
        System.out.println(otp.getText().split(" ")[0]);
        String vCode = otp.getText().split(" ")[0];


        WaitHelpers.javaWait("5000");

        driver.switchTo();
        WebElement otpMessage = FindElementbyId(driver,"otp-message");
        otpMessage.sendKeys(vCode);

        driver.quit();
        driver1.quit();


    }


}
