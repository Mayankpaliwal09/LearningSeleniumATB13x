package com.mayankPaliwal.ex11_File_Upload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Lab38_FileUpload2 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.expandtesting.com/upload");

        WebElement choose_file = driver.findElement(By.id("fileInput"));

        String dir = System.getProperty("user.dir");
        String path = dir+"\\src\\test\\java\\com\\mayankPaliwal\\ex11_File_Upload\\abc.txt";

        choose_file.sendKeys(path);


        WebElement submit = driver.findElement(By.id("fileSubmit"));
        submit.click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://practice.expandtesting.com/upload");
        WebElement h1 = driver.findElement(By.tagName("h1"));
        Assert.assertEquals(h1.getText(),"File Uploaded!");
        driver.quit();
    }
}
