package com.mayankPaliwal.Tasks;

import com.mayankPaliwal.ex07_WaitHelper.WaitHelpers;
import com.mayankPaliwal.utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.time.Duration;
import java.util.Collections;

public class Email_verification extends CommonToAll {


    @Test
    public void test_email_verification(){


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://iffy.com/");
        String mainWindow = driver.getWindowHandle();
       FindElementbyXpath(driver,"//a[text()='Sign up']").click();

       WaitHelpers.javaWait("3000");

//       FindElementbyXpath(driver,"//input[@id=\"firstName-field\"]").sendKeys("Mayank");
       FindElementbyId(driver,"firstName-field").sendKeys("mayank");
       FindElementbyId(driver,"lastName-field").sendKeys("paliwal");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://temp-mail.org/en/");
        String tempWindow = driver.getWindowHandle();
        WaitHelpers.javaWait("12000");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement emailvisiblity = driver.findElement(By.id("mail"));
        wait.until(d ->!emailvisiblity.getAttribute("value").equalsIgnoreCase("Loading.."));
        String email = emailvisiblity.getAttribute("value");
        System.out.println("temp email is "+email);



        driver.switchTo().window(mainWindow);

        FindElementbyId(driver,"emailAddress-field").sendKeys(email);
        FindElementbyXpath(driver,"//button/span[text()=\"Continue\"]").click();

        WaitHelpers.javaWait("12000");

        driver.switchTo().window(tempWindow);
        String sentence = driver.findElement(By.xpath("//a[contains(text(),' is your verification code')]")).getText();
        System.out.println(sentence);
        String otp = sentence.split(" ")[0];
        System.out.println(otp);

        driver.switchTo().window(mainWindow);
        FindElementbyXpath(driver,"//input[@aria-label=\"Enter verification code\"]").sendKeys(otp);
        FindElementbyXpath(driver,"//button[@data-localization-key=\"formbuttonprimary\"]");

        driver.quit();






    }
}
