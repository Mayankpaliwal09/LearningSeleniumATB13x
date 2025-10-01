package com.mayankPaliwal.ex15_Relative_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class Lab43_RL_P2 {

    @Test
    public void test_relative_locator_codePen(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://codepen.io/AbdullahSajjad/full/LYGVRgK");
        driver.manage().window().maximize();
        driver.switchTo().frame("result");

        driver.findElement(By.xpath("//form[@id=\"form\"]/button")).click();

        WebElement username = driver.findElement(By.xpath("//input[@id=\"username\"]"));

        WebElement error_msg = driver.findElement(with(By.tagName("small")).below(username));
        System.out.println(error_msg.getText());

        Assert.assertEquals(error_msg.getText(),"Username must be at least 3 characters");

        driver.close();
    }
}
