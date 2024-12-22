package com.apurba.in.ex01_SeleniumBasics;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class test01 {
    @Test
    public void test_selenium01(){
        EdgeDriver drive = new EdgeDriver();
        drive.get("https://app.vwo.com");
        System.out.println(drive.getTitle());
    }
}
