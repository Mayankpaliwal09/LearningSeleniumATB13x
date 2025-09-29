package com.mayankPaliwal.ex13_Javascript_ex;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab40_JS_Code {

    // java executor
    // when nothing works no xpath , no-action classes then we move back to jsExecutor

    @Test
    public  void test_js(){
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // another way to navigate to url / without using driver.get / navigate functions
        js.executeScript("window.location = 'https://google.com'");

        driver.get("https://selectorshub.com/xpath-practice-page/");
        WebElement div_to_scroll = driver.findElement(By.xpath("//div[@id='userName']"));

        js.executeScript("window.scroll(0,500);");
        js.executeScript("window.scroll(0,500);");

        String url = js.executeScript("return document.URL;").toString();
        String title = js.executeScript("return document.title;").toString();

        System.out.println(url);
        System.out.println(title);

//        driver.close();
    }
}
