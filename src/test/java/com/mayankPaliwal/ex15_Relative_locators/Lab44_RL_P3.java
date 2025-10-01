package com.mayankPaliwal.ex15_Relative_locators;

import com.mayankPaliwal.ex07_WaitHelper.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;
import org.testng.annotations.Test;

import java.util.List;

public class Lab44_RL_P3 {

    @Test
    public void test_relativeLocaor_apiCities(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.aqi.in/real-time-most-polluted-city-ranking");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@placeholder=\"Search\"]")).sendKeys("india", Keys.ENTER);


        WaitHelpers.javaWait("3000");

        List<WebElement> locations = driver.findElements(By.xpath("//div[contains(@class,\"location-name\")]"));

        for(WebElement location : locations){

            String Rank = driver.findElement(with(By.tagName("p")).toLeftOf(location)).getText();
            String aqi = driver.findElement(with(By.tagName("div")).toRightOf(location)).getText();
//            System.out.println(location.getText());
            System.out.println("| +" + Rank + " | " + location.getText() + " | " + aqi + " | ");
        }


        driver.close();

    }
}
