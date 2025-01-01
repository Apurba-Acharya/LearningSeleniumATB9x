package com.apurba.in.ex06_Selenium_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Practice_2 {
        @Test
        public void new_user_registration() throws InterruptedException {
            WebDriver driver = new EdgeDriver();
            driver.get("https://www.idrive360.com/enterprise/login");
            driver.manage().window().maximize();
            Thread.sleep(5000);

            WebElement newacc = driver.findElement(By.xpath("//a[@class=\"id-crte-newacc\"]"));
            newacc.click();
            Thread.sleep(5000);

            WebElement fname = driver.findElement(By.xpath("//input[@name=\"fname\"]"));
            fname.sendKeys("XYZ");
            WebElement sname = driver.findElement(By.xpath("//input[@name=\"lname\"]"));
            sname.sendKeys("ABC");
            WebElement email = driver.findElement(By.xpath("//input[@id=\"email\"]"));
            email.sendKeys("ABChho55@abc.com");
            WebElement pass = driver.findElement(By.xpath("//input[@id=\"password\"]"));
            pass.sendKeys("Abc@asd");
            WebElement cn = driver.findElement(By.xpath("//input[@id=\"cname\"]"));
            cn.sendKeys("ABC Enterprise");
            WebElement mo1 = driver.findElement(By.xpath("//div[@class=\"selected-flag dropdown-toggle\"]"));
            mo1.click();
            WebElement mo2 = driver.findElement(By.xpath("//input[@placeholder=\"Search Country\"]"));
            mo2.sendKeys("India");
            WebElement mo3 = driver.findElement(By.xpath("//*[text()=\"India (भारत)\"]"));
            mo3.click();
            Thread.sleep(3000);
            WebElement mo4 = driver.findElement(By.xpath("//input[@id=\"telnumSignup\"]"));
            mo4.sendKeys("1236547890");
            WebElement button = driver.findElement(By.xpath("//button[@id=\"frm-btn\"]"));
            button.click();

            Thread.sleep(23000);
            WebElement h3 = driver.findElement(By.xpath("//h3[@class=\"id-wlcme-bnrhd\"]"));
            Assert.assertEquals(h3.getText(),"Welcome to IDrive ®360!");
            driver.quit();
        }
    }