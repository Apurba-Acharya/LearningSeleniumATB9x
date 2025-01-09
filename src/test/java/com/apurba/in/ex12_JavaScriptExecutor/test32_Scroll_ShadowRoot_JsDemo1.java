package com.apurba.in.ex12_JavaScriptExecutor;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class test32_Scroll_ShadowRoot_JsDemo1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.lambdatest.com/selenium-playground/shadow-dom");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[normalize-space()='Shadow DOM']")));

        JavascriptExecutor js =(JavascriptExecutor)driver;

        //scroll to defined location using js
        WebElement form = driver.findElement(By.xpath("//p[contains(text(),'This is just an example of shadom DOM, this form w')]"));
        js.executeScript("arguments[0].scrollIntoView(true);",form);

        //handling of shadow root
        WebElement element = (WebElement) js.executeScript(" return document.querySelector(\"#__next > section.mt-50 > div > div > div:nth-child(2) > shadow-signup-form\").shadowRoot.querySelector(\"div > form > div:nth-child(2) > div > input\") ;");
        // (script format: "return (Copy JS path);"
        element.sendKeys("ATB");
        WebElement submit = (WebElement) js.executeScript("return document.querySelector(\"#__next > section.mt-50 > div > div > div:nth-child(2) > shadow-signup-form\").shadowRoot.querySelector(\"div > form > div:nth-child(6) > div > button\") ;");
        submit.click();
    }
}
