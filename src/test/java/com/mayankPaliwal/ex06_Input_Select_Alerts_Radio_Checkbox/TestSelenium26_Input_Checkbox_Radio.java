package com.mayankPaliwal.ex06_Input_Select_Alerts_Radio_Checkbox;

import com.mayankPaliwal.utils.CommonToAll;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static com.mayankPaliwal.utils.CommonToAll.closeBrowser;

public class TestSelenium26_Input_Checkbox_Radio extends CommonToAll {

    @Description(" Fill The details of awesomeQA and verify")
    @Test
    public void test_awesomeQA(){

//        //input[@id="sex-0"]

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();


        WebElement fname = driver.findElement(By.name("firstname"));
        fname.sendKeys("mayank");

        WebElement lname = driver.findElement(By.name("lastname"));
        lname.sendKeys("paliwal");

        WebElement gender = driver.findElement(By.xpath("//input[@id=\"sex-0\"]"));
        gender.click();

        WebElement yoe = driver.findElement(By.id("exp-1"));
        yoe.click();

        WebElement profession = driver.findElement(By.id("profession-1"));
        profession.click();

        WebElement tool = driver.findElement(By.id("tool-2"));
        tool.click();


        WebElement continents = driver.findElement(By.id("continents"));
        continents.click();
        continents.click();
        Select select = new Select(continents);
        select.selectByVisibleText("Europe");


        WebElement button = driver.findElement(By.cssSelector("button[id='submit']"));
        button.click();
        closeBrowser(driver);
    }
}
