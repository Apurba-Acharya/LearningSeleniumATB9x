package com.ex04_Selenium_OptionClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class test18_Extensions {
    @Test
    public void selenium01 () throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addExtensions(new File("src/test/java/com/apurba/in/ex04_Selenium_OptionClass/AdBlock.crx"));

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://youtube.com");
        Thread.sleep(15000);
    }
}
