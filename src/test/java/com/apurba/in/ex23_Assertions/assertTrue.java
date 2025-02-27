package com.apurba.in.ex23_Assertions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class assertTrue {
    @Test
    public void assertT(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("HYR Tuto");
        WebElement button = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']"));

        Assert.assertTrue(button.isDisplayed() && button.isEnabled());
        button.click();

    }
}
