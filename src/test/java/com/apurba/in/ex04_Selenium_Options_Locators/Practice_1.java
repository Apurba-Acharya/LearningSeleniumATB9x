package com.apurba.in.ex04_Selenium_Options_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class Practice_1 {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("src/test/java/com/apurba/in/ex04_Selenium_Options_Locators/AdBlock.crx"));

        WebDriver drive = new ChromeDriver(options);
        drive.get("https://www.google.com");
        drive.quit();
    }
}
