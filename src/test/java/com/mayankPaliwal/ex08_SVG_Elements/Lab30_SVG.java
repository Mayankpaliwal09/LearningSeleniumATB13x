package com.mayankPaliwal.ex08_SVG_Elements;

import com.mayankPaliwal.ex07_WaitHelper.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Lab30_SVG {


    @Test
    public void test_Flipkart_Search_ICON() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");

        WebElement search_input = driver.findElement(By.name("q"));
        search_input.sendKeys("macmini");

        List<WebElement> svgElement = driver.findElements(By.xpath("//*[name()='svg']"));
        svgElement.get(0).click();

       WaitHelpers.waitForVisibility(driver,5000,"//div[contains(@data-id,'CPU')]/div/a[2]");

        List<WebElement> titles = driver.findElements(By.xpath("//div[contains(@data-id,'CPU') or contains(@data-id,'MP')]/div/a[2]"));

        for(WebElement title:titles){
            System.out.println(title.getText());
        }


        WebElement nextButton = driver.findElement(By.xpath("//a[normalize-space()='Next']"));

        boolean hasNext = true;
      while (hasNext){

          WaitHelpers.waitForVisibility(driver,5000,"//div[contains(@data-id,'CPU')]/div/a[2]");

          List<WebElement> titles2 = driver.findElements(By.xpath("//div[contains(@data-id,'CPU') or contains(@data-id,'MP')]/div/a[2]"));
          for(WebElement title:titles2){
              System.out.println(title.getText());
          }

          List<WebElement> nextButtons = driver.findElements(By.xpath("//a[normalize-space()='Next']"));
          if(!nextButtons.isEmpty()){
              nextButtons.get(0).click();
          }else {
              hasNext = false;
          }
      }


driver.quit();


    }

}
