package com.mayankPaliwal.ex08_SVG_Elements;

import com.mayankPaliwal.ex07_WaitHelper.WaitHelpers;
import com.mayankPaliwal.utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Lab31_SVG_MAPS extends CommonToAll {

    //*[name()="svg"]/*[name()="g"][7]/*[name()="g"]/*[name()="g"]/*[name()="path"]


    @Test
    public void test_svg_maps(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amcharts.com/svg-maps/?map=india");

        WaitHelpers.waitForVisibility(driver,3,"//*[name()=\"svg\"]/*[name()=\"g\"][7]/*[name()=\"g\"]/*[name()=\"g\"]/*[name()=\"path\"]");

        List<WebElement> states = FindElementsbyId(driver,"//*[name()=\"svg\"]/*[name()=\"g\"][7]/*[name()=\"g\"]/*[name()=\"g\"]/*[name()=\"path\"]");
//        List<WebElement> states = driver.findElements(By.xpath("//*[name()=\"svg\"]/*[name()=\"g\"][7]/*[name()=\"g\"]/*[name()=\"g\"]/*[name()=\"path\"]"));

        for(WebElement state:states){
            System.out.println(state.getDomAttribute("aria-label"));
            if(state.getDomAttribute("aria-label").contains("Haryana")){
                state.click();
            }
        }

        driver.quit();

    }

}
