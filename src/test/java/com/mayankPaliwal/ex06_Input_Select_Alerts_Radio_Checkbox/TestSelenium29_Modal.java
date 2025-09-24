package com.mayankPaliwal.ex06_Input_Select_Alerts_Radio_Checkbox;

import com.mayankPaliwal.ex07_WaitHelper.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import static com.mayankPaliwal.utils.CommonToAll.*;

public class TestSelenium29_Modal  {


    public static void main(String[] args) {


        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.makemytrip.com/");


//          WaitHelpers.javaWait("3000");
//          javaWait("3000");

//        new WaitHelpers().waitForVisibility(driver,3000,"//span[@data-cy='closeModal']");

        // Static method called directly using classs
        WaitHelpers.waitForVisibility(driver,3000,"//span[@data-cy='closeModal']");
        WebElement e = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        e.click();

        closeBrowser(driver);
    }

}
