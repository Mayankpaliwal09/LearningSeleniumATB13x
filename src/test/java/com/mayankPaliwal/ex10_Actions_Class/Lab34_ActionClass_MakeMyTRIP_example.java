package com.mayankPaliwal.ex10_Actions_Class;

import com.mayankPaliwal.ex07_WaitHelper.WaitHelpers;
import com.mayankPaliwal.utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class Lab34_ActionClass_MakeMyTRIP_example extends CommonToAll {

    @Test
    public void test_MMT_action(){
        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.makemytrip.com/");
        openBrowser(driver,"https://www.makemytrip.com/");

        WaitHelpers.waitForVisibility(driver,5000,"//span[@data-cy=\"closeModal\"]");

        FindElementbyXpath(driver,"//span[@data-cy=\"closeModal\"]").click();
        FindElementbyXpath(driver,"//span[@data-cy='travel-card-close']").click();


        WaitHelpers.javaWait("5000");

        WebElement fromCity = FindElementbyXpath(driver,"//input[@data-cy='fromCity']");
        WebElement toCity = FindElementbyXpath(driver,"//input[@data-cy=\"toCity\"]");

        Actions actions = new Actions(driver);

        actions.moveToElement(fromCity).click().build().perform();
        actions.sendKeys(fromCity,"IXC").build().perform();

        WaitHelpers.javaWait("5000");

        List<WebElement> listCitiesFrom = driver.findElements(By.xpath("//ul[@class=\"react-autosuggest__suggestions-list\"]/li"));
        System.out.println(listCitiesFrom.get(0).getText());

        try{
            for(WebElement e:listCitiesFrom){
                if (e.getText().contains("Chandigarh")){
                    e.click();
                    System.out.println("in from section");
                }
            }
        } catch (Exception e) {
            System.out.println("oK");
        }



        actions.moveToElement(toCity).click().build().perform();
        actions.sendKeys(toCity,"AGR").build().perform();

        WaitHelpers.javaWait("5000");

        List<WebElement> listCitiesTO = driver.findElements(By.xpath("//ul[@class=\"react-autosuggest__suggestions-list\"]/li"));
        try{
            for(WebElement e:listCitiesTO){
                if (e.getText().contains("Agra")){
                    e.click();
                    System.out.println("in to section");
                }
            }
        } catch (Exception e) {
            System.out.println("oK");
        }

        driver.close();

    }
}
