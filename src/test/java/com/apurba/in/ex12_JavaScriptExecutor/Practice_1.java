package com.apurba.in.ex12_JavaScriptExecutor;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Practice_1 {
    @Test
     public void set1() throws InterruptedException {
     WebDriver driver = new EdgeDriver();
     driver.get("https://www.lambdatest.com/selenium-playground/shadow-dom");
     driver.manage().window().maximize();
     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[normalize-space()='Shadow DOM']")));

     JavascriptExecutor js = (JavascriptExecutor) driver;
     WebElement form = driver.findElement(By.xpath("//p[contains(text(),'This is just an example of shadom DOM, this form w')]"));
     js.executeScript("arguments[0].scrollIntoView(true);",form);
     WebElement element = (WebElement) js.executeScript(" return document.querySelector(\"#__next > section.mt-50 > div > div > div:nth-child(2) > shadow-signup-form\").shadowRoot.querySelector(\"div > form > div:nth-child(2) > div > input\") ;");
     element.sendKeys("ATB");
     WebElement submit = (WebElement) js.executeScript("return document.querySelector(\"#__next > section.mt-50 > div > div > div:nth-child(2) > shadow-signup-form\").shadowRoot.querySelector(\"div > form > div:nth-child(6) > div > button\") ;");
     submit.click();

    }
}
