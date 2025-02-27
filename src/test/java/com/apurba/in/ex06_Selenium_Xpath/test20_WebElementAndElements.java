package com.apurba.in.ex06_Selenium_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class test20_WebElementAndElements {
    @Test
    public void katalon() throws InterruptedException {
        EdgeOptions eo = new EdgeOptions();
        eo.addArguments("--start maximized");

        WebDriver driver = new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        Thread.sleep(3000);

        WebElement make_appointment_button = driver.findElement(By.xpath("//a[@href=\"./profile.php#login\"]"));
        make_appointment_button.click();

//        WebElement username = driver.findElement(By.xpath("//input[@id=\"txt-username\"]"));
//        username.sendKeys("John Doe");
//
//        WebElement password = driver.findElement(By.xpath("//input[@id=\"txt-password\"]"));
//        password.sendKeys("ThisIsNotAPassword");

        List<WebElement> username_input_box = driver.findElements(By.xpath("//input[@placeholder='Username']"));
        username_input_box.get(1).sendKeys("John Doe");

        List<WebElement> password_input_box = driver.findElements(By.xpath("//input[@placeholder='Password']"));
        password_input_box.get(1).sendKeys("ThisIsNotAPassword");

        WebElement login_button = driver.findElement(By.xpath("//button[@id=\"btn-login\"]"));
        login_button.click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");

        Thread.sleep(3000);
        driver.quit();


    }
}
