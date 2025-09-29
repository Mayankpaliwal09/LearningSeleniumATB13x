package com.mayankPaliwal.ex10_Actions_Class;

import com.mayankPaliwal.utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.sql.Driver;

public class Lab36_ActionClass_Drag_Drop extends CommonToAll {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");

        Actions actions = new Actions(driver);

        WebElement colA = driver.findElement(By.id("column-a"));
        WebElement colB = driver.findElement(By.id("column-b"));

        int a = 5;
        for(int i =0;i<=a;i++){
            actions.dragAndDrop(colA,colB).build().perform();
        }

        driver.quit();

    }
}
