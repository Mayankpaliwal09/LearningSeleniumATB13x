package com.mayankPaliwal.ex10_Actions_Class;

import com.mayankPaliwal.utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class Lab31_ActionClass extends CommonToAll {

  @Test
    public void test_key_action(){

      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://awesomeqa.com/practice.html");

      WebElement name = driver.findElement(By.name("firstname"));

      Actions actions = new Actions(driver);
      actions.keyDown(Keys.SHIFT)
              .sendKeys(name,"mayank")
              .keyUp(Keys.SHIFT).build().perform();

      closeBrowser(driver);

  }

}
