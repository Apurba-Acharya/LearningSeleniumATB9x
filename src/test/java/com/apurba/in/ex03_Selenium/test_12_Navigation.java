package com.apurba.in.ex03_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;


public class test_12_Navigation {
    @Test
    public void selenium01 () throws Exception {

        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com/");

        //Types of navigation in Selenium:
        driver.navigate().to("htttps://bing.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }
}
