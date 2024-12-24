package com.apurba.in.ex03_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class test_07 {
    @Test
    public void selenium01 (){
        
        // 2  Do you want to run on Chrome then change to Edge ?
        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

        driver.manage().window().maximize();

    }

}
