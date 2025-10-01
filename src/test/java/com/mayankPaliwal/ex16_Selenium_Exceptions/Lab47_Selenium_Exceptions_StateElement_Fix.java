package com.mayankPaliwal.ex16_Selenium_Exceptions;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab47_Selenium_Exceptions_StateElement_Fix {

    @Test
    public void test_SeleniumException_StaleElement_Fix(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        WebElement textArea = driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]"));

        driver.navigate().refresh();

        try {
            textArea.sendKeys("mouse", Keys.ENTER);
        } catch (StaleElementReferenceException e) {
            System.out.println("StaleElementReferenceException");

            // if we found the stale element then we have to write logic again to find the element

            WebElement searchArea = driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]"));
            searchArea.sendKeys("mouse", Keys.ENTER);

        }
    }
}
