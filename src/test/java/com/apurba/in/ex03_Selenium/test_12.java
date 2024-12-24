package com.apurba.in.ex03_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class test_12 {
    @Test
    public void selenium01 () throws Exception {

        // 2  Do you want to run on Chrome then change to Edge ?
        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com/");
        driver.navigate().to("htttps://bing.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

    }

}
