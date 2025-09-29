package com.mayankPaliwal.ex12_Windows;

import com.mayankPaliwal.ex07_WaitHelper.WaitHelpers;
import com.mayankPaliwal.utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class AdvanceTestProject extends CommonToAll{


    @Test
    public void test_project_VWO_heatmap(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/analyze/heatmap/3/reports?token=eyJhY2NvdW50X2lkIjoxMTM0NTkxLCJleHBlcmltZW50X2lkIjozLCJjcmVhdGVkX29uIjoxNzU2MDA4MDkyLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiZTlmNmY0ZGZlMGJhMGIxNmQxMjZmMGJlOTUyMDQ3MmEiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&accountId=1134591");
        driver.manage().window().maximize();

        WaitHelpers.javaWait("3000");

        String parent_window_handle = driver.getWindowHandle();
        System.out.println("Parent window "+parent_window_handle);

        WebElement url_input = driver.findElement(By.name("primaryUrl"));
        url_input.clear();
        url_input.sendKeys("https://thetestingacademy.com");

        WebElement viewheatmap_Btn = driver.findElement(By.xpath("//button[text()=\" View Heatmap \"]"));
        viewheatmap_Btn.click();

        WaitHelpers.javaWait("10000");

        Set<String> window_handles = driver.getWindowHandles();
        System.out.println(window_handles);


        closeBrowser(driver);


    }



}
