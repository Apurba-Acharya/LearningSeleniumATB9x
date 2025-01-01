package com.apurba.in.ex06_Selenium_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Practice_1 {
    @Test
    public void idrive () throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.idrive360.com/enterprise/login");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        WebElement email = driver.findElement(By.xpath("//input[@name=\"username\"]"));
        email.sendKeys("augtest_040823@idrive.com");

        WebElement password = driver.findElement(By.xpath("//input[@id=\"password\"]"));
        password.sendKeys("123456");

        WebElement checkbox = driver.findElement(By.xpath("//span[@class=\"id-checkmark\"]"));
        checkbox.click();

        WebElement signin = driver.findElement(By.xpath("//button[@id=\"frm-btn\"]"));
        signin.click();

        Thread.sleep(23000);

        WebElement exp_icon = driver.findElement(By.xpath("//i[@class=\"id-expire-msg-icon\"]"));
        exp_icon.isDisplayed();

        WebElement l1 = driver.findElement(By.xpath("//h5[@class=\"id-card-title\"]"));
        Assert.assertEquals(l1.getText(),"Your free trial has expired");

        WebElement l2 = driver.findElement(By.xpath("//*[text()=\"and your account has been canceled.\"]"));
        Assert.assertEquals(l2.getText(),"and your account has been canceled.");

        WebElement l3 = driver.findElement(By.xpath("//*[text()=\"In order to reactivate your account, upgrade your account and save 25%*.\"]"));
        Assert.assertEquals(l3.getText(),"In order to reactivate your account, upgrade your account and save 25%*.");


        Thread.sleep(3000);
        driver.quit();


    }
}
