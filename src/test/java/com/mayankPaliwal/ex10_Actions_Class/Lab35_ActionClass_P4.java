package com.mayankPaliwal.ex10_Actions_Class;

import com.mayankPaliwal.ex07_WaitHelper.WaitHelpers;
import com.mayankPaliwal.utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class Lab35_ActionClass_P4 extends CommonToAll {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://thetestingacademy.com/");

        Actions actions = new Actions(driver);

        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();

        WaitHelpers.javaWait("5000");
        actions.sendKeys(Keys.PAGE_UP).sendKeys(Keys.PAGE_UP).build().perform();

        driver.quit();

    }
}
