package com.apurba.in.ex12_JavaScriptExecutor;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_ShadowRoot_JsDemo1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();

        JavascriptExecutor js =(JavascriptExecutor)driver;

        //scroll to defined location using js
        WebElement div_to_Scroll = driver.findElement(By.xpath("//div[@id=\"userName\"]"));
        js.executeScript("arguments[0].scrollIntoView(true);",div_to_Scroll);
        Thread.sleep(30);

        //handling of shadow root
        WebElement inputboxPizza = (WebElement) js.executeScript("return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\");");
        // (script format: "return (Copy JS path);"
        inputboxPizza.sendKeys("farmhouse");
    }
}
