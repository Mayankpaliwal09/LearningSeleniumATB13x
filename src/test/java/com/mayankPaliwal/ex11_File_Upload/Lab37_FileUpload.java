package com.mayankPaliwal.ex11_File_Upload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab37_FileUpload {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/selenium/upload.html");

        WebElement fileToUpload = driver.findElement(By.id("fileToupload"));

        String user_dir = System.getProperty("user.dir");  // D:\TESTING ACADEMY\JAVA-QUES\LearningSeleniumATB13x
        String path = user_dir+"\\src\\test\\java\\com\\mayankPaliwal\\ex11_File_Upload\\abc.txt";

        fileToUpload.sendKeys(path);

        driver.findElement(By.name("submit")).click();
    }
}
