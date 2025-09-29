package com.mayankPaliwal.ex12_Windows;

import com.mayankPaliwal.ex07_WaitHelper.WaitHelpers;
import com.mayankPaliwal.utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class Lab38_Windows_Part1  extends CommonToAll {
    @Test
    public void test_window(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");

        String parent_tab_id = driver.getWindowHandle();
        System.out.println(parent_tab_id);
        System.out.println(driver);

        WebElement btn = driver.findElement(By.xpath("//a[text()='Click Here']"));
        btn.click();


        // 2 windows


        Set<String> window_handle_ids = driver.getWindowHandles();
        System.out.println(window_handle_ids);

        for(String window: window_handle_ids){
            driver.switchTo().window(window);
            if(driver.getPageSource().contains("New Window")){
                System.out.println("Test Cases passed!");
            }
        }

        driver.switchTo().window(parent_tab_id);
        // How do I switch to the child window and
        // verify that there is a text with the name of new window?

//        driver.findElement(By.xpath("//h3[contains(text(),\"New\")]"));
//       WebElement tab2 = driver.findElement(By.xpath("//h3"));
//        Assert.assertEquals(tab2.getText(),"New Window");

        WaitHelpers.javaWait("3000");


        closeBrowser(driver);

    }
}
