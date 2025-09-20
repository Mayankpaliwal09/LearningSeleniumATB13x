package com.mayankPaliwal.ex05_Selenium_Waits;


import com.mayankPaliwal.ex07_WaitHelper.WaitHelpers;
import com.mayankPaliwal.utils.CommonToAll;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium24_MiniProject4 extends WaitHelpers {

    @Description("Verify makemytrip opens with Modal")
    @Test
    public void testClosemodal(){

        WebDriver driver = new ChromeDriver();
    driver.navigate().to("https://www.makemytrip.com/");
//        openBrowser("https://www.makemytrip.com/","chrome");
        System.out.println(driver.getTitle());

        waitForVisibility(driver,5,"//span[@data-cy='closeModal']");

        WebElement closeModal = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        closeModal.click();

        closeBrowser(driver);


    }


}
