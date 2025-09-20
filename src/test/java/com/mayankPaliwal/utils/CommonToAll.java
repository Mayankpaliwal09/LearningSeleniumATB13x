package com.mayankPaliwal.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonToAll {

        public WebDriver driver;
        public void openBrowser( String url , String browser){

            if(browser.equalsIgnoreCase("chrome")){
                this.driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("firefox")){
                this.driver = new FirefoxDriver();
            } else {
                driver = new ChromeDriver();
            }

            driver.get(url);
            driver.manage().window().maximize();
        }


//        public void  javaWait(int waitTime){
//            try {
//                Thread.sleep(waitTime);
//            } catch (Exception e) {
//                throw new RuntimeException(e);
//            }
//        }

    public static void closeBrowser(WebDriver driver){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }


    public WebElement partialText(String partiallinkText) {

       WebElement partialLink = driver.findElement(By.partialLinkText(partiallinkText));
        partialLink.click();

        return partialLink;

    }

}
