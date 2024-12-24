package com.apurba.in.ex03_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class test_04 {
    @Test
    public void selenium01 (){

        // 2  Do you want to run on Chrome then change to Edge ?
        WebDriver driver = new ChromeDriver();
        driver = new EdgeDriver();// 97% -
        driver = new FirefoxDriver(); // 97% -
    }

}
