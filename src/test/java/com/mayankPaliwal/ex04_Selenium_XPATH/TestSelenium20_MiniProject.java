package com.mayankPaliwal.ex04_Selenium_XPATH;


import com.mayankPaliwal.ex07_WaitHelper.WaitHelpers;
import com.mayankPaliwal.utils.CommonToAll;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.mayankPaliwal.utils.CommonToAll.*;


public class TestSelenium20_MiniProject extends WaitHelpers {

    private static final Logger log = LoggerFactory.getLogger(TestSelenium20_MiniProject.class);

    @Description("Verify Login is working of OrangeHRM ")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Mayank Paliwal")
    @Test
    public void test_verify_login(){

        // 3rd september

        WebDriver driver = new ChromeDriver();
        openBrowser(driver ,"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        try {
//            Thread.sleep(3000);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

        javaWait("3000");

        // get login page url
        String url = driver.getCurrentUrl();
        String title = driver.getTitle();
        WebElement loginText = driver.findElement(By.xpath("//h5[text()='Login']"));
        Assert.assertEquals(loginText.getText(),"Login");
        Assert.assertEquals(url,"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Assert.assertEquals(title,"OrangeHRM");


        WebElement username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
           username.sendKeys("Admin");

        WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
        password.sendKeys("admin123");

        WebElement loginButton = driver.findElement(By.xpath("//button[normalize-space(text()=\"Login\")]"));
        loginButton.click();


        String dashboardURL = driver.getCurrentUrl();
        Assert.assertEquals(dashboardURL,"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");


        closeBrowser(driver);
    }
}
