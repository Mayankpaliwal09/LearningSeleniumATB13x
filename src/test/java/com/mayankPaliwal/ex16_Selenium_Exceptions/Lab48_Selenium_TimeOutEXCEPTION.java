package com.mayankPaliwal.ex16_Selenium_Exceptions;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Lab48_Selenium_TimeOutEXCEPTION {
    @Test
    public void test_SeleniumException_StaleElement(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='AP']")));

            WebElement textArea = driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]"));
            textArea.sendKeys("mouse", Keys.ENTER);
        } catch (TimeoutException e) {
            System.out.println("Time out element not found");
        }

//        org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of element located by By.xpath: //textarea[@id='AP'] (tried for 10 second(s) with 500 milliseconds interval)
//        Build info: version: '4.35.0', revision: '1c58e5028b'

        driver.close();

    }

}
