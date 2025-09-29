package com.mayankPaliwal.ex14_JS_ShadowDOM;

import com.mayankPaliwal.ex07_WaitHelper.WaitHelpers;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static com.mayankPaliwal.utils.CommonToAll.closeBrowser;

public class Lab41_JS_Code_ShadowDOM  {

    @Test()
    public void test_js_shadow_dom(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();


        //        driver.findElement(By.id("pizza")).sendKeys("farmhouse");

        WaitHelpers.javaWait("3000");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement inputBox = (WebElement) js.executeScript("return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\");");

        inputBox.sendKeys("margherita");

        closeBrowser(driver);
    }
}
