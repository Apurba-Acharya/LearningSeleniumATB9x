package com.apurba.in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.sql.Driver;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Flipkart {
    @Test
    public void flipkart() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments(" --incognito");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.flipkart.in/");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        String flipkart_logo = driver.findElement(By.xpath("//img[@title='Flipkart']")).getAttribute("title");
        Assert.assertEquals(flipkart_logo,"Flipkart");
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Login']"))).build().perform();
        List <WebElement> login_popup= driver.findElements(By.xpath("//ul[@class='_3YjYK7 ecs1XG']//a"));
        for (int i=0; i<login_popup.size(); i++){
            System.out.println(login_popup.get(i).getText());
            //Validation pending
        }
        actions.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Cart']"))).build().perform();
        actions.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Become a Seller')]"))).build().perform();
        actions.moveToElement(driver.findElement(By.xpath("//img[@alt='Dropdown with more help links']"))).build().perform();
        List <WebElement> more_help= driver.findElements(By.xpath("//ul[@class='_3YjYK7']//a"));
        for (int i=0; i<more_help.size(); i++){
            System.out.println(more_help.get(i).getText());
            //Validation pending
        }
        driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("iphone 16");
        Thread.sleep(5000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        List <WebElement> searched_values = driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']//div//a//div[2]"));
        for (WebElement values : searched_values) {
           String value = values.getText();
            System.out.println(value);
        }

    }
}
