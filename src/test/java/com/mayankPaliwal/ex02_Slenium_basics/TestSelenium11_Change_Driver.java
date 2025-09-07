package com.mayankPaliwal.ex02_Slenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.lang.ref.WeakReference;

public class TestSelenium11_Change_Driver {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver = new EdgeDriver();
    }
}
