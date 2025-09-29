package com.mayankPaliwal.ex10_Actions_Class;

import com.mayankPaliwal.utils.CommonToAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Lab32_ActionClass extends CommonToAll {


    @Test
    public void test_actions(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.spicejet.com/");

        WebElement source = FindElementbyXpath(driver,"//div[text()=\"From\"]/following-sibling::div/input");

        Actions actions = new Actions(driver);
        //move to element
        //click
        //sendkeys = blr
        WebElement destination = FindElementbyXpath(driver,"//div[@data-testid=\"to-testID-destination\"]/div/div/input");

        actions.moveToElement(source).click().sendKeys("BLR").build().perform();
        actions.moveToElement(destination).click().sendKeys("DEL").build().perform();

        closeBrowser(driver);

    }
}
