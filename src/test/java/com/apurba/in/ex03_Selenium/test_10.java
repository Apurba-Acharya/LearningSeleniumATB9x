package com.apurba.in.ex03_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class test_10 {
    @Test
    public void selenium01 () throws Exception {
        
        // 2  Do you want to run on Chrome then change to Edge ?
        WebDriver driver = new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();

        if (driver.getPageSource().contains("CURA Healthcare Service")){
            System.out.println("visible");
            Assert.assertTrue(true);
        } else{
            throw new Exception("not visible");
        }

    }

}
