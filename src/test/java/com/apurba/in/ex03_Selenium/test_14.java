package com.apurba.in.ex03_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;


public class test_14 {
    @Test
    public void selenium01 () throws Exception {
        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com/");
        Thread.sleep(3000);
        driver.close();
        //driver.quit();

    }

}
