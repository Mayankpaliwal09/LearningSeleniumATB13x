package com.mayankPaliwal.ex16_Selenium_Exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab46_Selenium_Exceptions_StateElement {

    @Test
    public void test_SeleniumException_StaleElement(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

       WebElement textArea = driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]"));

       driver.navigate().refresh();

//        org.openqa.selenium.StaleElementReferenceException: stale element reference: stale element not found
//        (Session info: chrome=140.0.7339.208)

       textArea.sendKeys("mouse", Keys.ENTER);
    }

}
