package com.ex01_SeleniumBasics;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class test01 {
    @Test
    public void test_selenium01(){
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");
        System.out.println();
    }
}
