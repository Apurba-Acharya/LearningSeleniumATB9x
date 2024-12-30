package com.apurba.in.ex_05_Selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class test19 {
    @Test
    public void selenium01 () throws Exception {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com/#/login");

        WebElement linkText = driver.findElement(By.className("text-link"));
        linkText.click();

        WebElement email = driver.findElement(By.id("page-v1-step1-email"));
        email.sendKeys("244004cjsjcbs");

        WebElement checkbox = driver.findElement(By.name("gdpr_consent_checkbox"));
        checkbox.click();

        List <WebElement> buttons = driver.findElements(By.tagName("button"));
        buttons.get(0).click();

        //<div
        // class="C($color-red) Fz($font-size-12) Trsp($Op) Trsdu(0.15s) Op(0) invalid-input+Op(1) invalid-reason">
        // The email address you entered is incorrect.
        // </div>
        WebElement error = driver.findElement(By.className("invalid-reason"));
        Assert.assertEquals(error.getText(),"The email address you entered is incorrect.");

        Thread.sleep(5000);
        driver.quit();
    }
}
