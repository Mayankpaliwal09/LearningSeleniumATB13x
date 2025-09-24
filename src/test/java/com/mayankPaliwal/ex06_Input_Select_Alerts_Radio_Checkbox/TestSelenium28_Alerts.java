package com.mayankPaliwal.ex06_Input_Select_Alerts_Radio_Checkbox;

import com.mayankPaliwal.ex07_WaitHelper.WaitHelpers;
import com.mayankPaliwal.utils.CommonToAll;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium28_Alerts extends CommonToAll {

    @Test
    public void test_Alert(){

        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

//        WebElement element = driver.findElement(By.xpath("//button[contains(text(),'Alert')]"));
//        element.click();

        WebElement element2 = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        element2.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
//        alert.accept();
        alert.dismiss();

       String result = driver.findElement(By.xpath("//p[@id='result']")).getText();
        System.out.println(result);
//        Assert.assertEquals(result.getText(), "You successfully clicked an alert");
//        Assert.assertEquals(result, "You clicked: Ok");
        Assert.assertEquals(result, "You clicked: Cancel");




        WebElement promtElement = driver.findElement(By.cssSelector("button[onclick='jsPrompt()']"));
        promtElement.click();

        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait2.until(ExpectedConditions.alertIsPresent());
        String name = "Mayank";
        alert.sendKeys(name);
        alert.accept();

    String resultPrompt = driver.findElement(By.xpath("//p[@id='result']")).getText();
    Assert.assertEquals(resultPrompt,"You entered: "+name);

        driver.quit();
    }
}
