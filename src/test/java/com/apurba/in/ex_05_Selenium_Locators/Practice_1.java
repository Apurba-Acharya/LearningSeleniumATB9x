package com.apurba.in.ex_05_Selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Practice_1 {
    @Test
    public void p1() throws InterruptedException {
        EdgeOptions eo = new EdgeOptions();
        eo.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        Thread.sleep(3000);

        WebElement link = driver.findElement(By.id("btn-make-appointment"));
        link.click();

        WebElement un = driver.findElement(By.id("txt-username" ));
        un.sendKeys("John Doe");

        WebElement psw = driver.findElement(By.id("txt-password"));
        psw.sendKeys("ThisIsNotAPassword");

        WebElement button = driver.findElement(By.id("btn-login"));
        button.click();

        String currenturl = driver.getCurrentUrl();
        Assert.assertEquals(currenturl,"https://katalon-demo-cura.herokuapp.com/#appointment");

        driver.quit();


    }
}
