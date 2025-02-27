package com.apurba.in.ex06_Selenium_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class iDrive {
    @Test
    public void new_user_registration() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.idrive360.com/enterprise/login");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        WebElement newacc = driver.findElement(By.xpath("//a[@class=\"id-crte-newacc\"]"));
        newacc.click();
        Thread.sleep(5000);

        driver.findElement(By.name("fname")).sendKeys("XYZ");
        driver.findElement(By.xpath("//input[@name=\"lname\"]")).sendKeys("ABC");
        driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("ABuuhho55@abc.com");
        driver.findElement(By.id("password")).sendKeys("Abc@asd");
        driver.findElement(By.id("cname")).sendKeys("ABC Enterprise");
        driver.findElement(By.xpath("//div[@class=\"selected-flag dropdown-toggle\"]")).click();
        WebElement mo2 = driver.findElement(By.xpath("//ul[@class=\"country-list\"]/li[101]/span[1]"));
        mo2.click();
//          driver.findElement(By.xpath("//input[@placeholder=\"Search Country\"]")).sendKeys("India");
//            WebElement mo3 = driver.findElement(By.xpath("//*[text()=\"India (भारत)\"]"));
//            mo3.click();
        Thread.sleep(3000);
        driver.findElement(By.id("telnumSignup")).sendKeys("1236547890");
        driver.findElement(By.id("frm-btn")).click();

        Thread.sleep(23000);
        WebElement h3 = driver.findElement(By.xpath("//h3[@class=\"id-wlcme-bnrhd\"]"));
        Assert.assertEquals(h3.getText(), "Welcome to IDrive ®360!");
        driver.quit();
    }
}