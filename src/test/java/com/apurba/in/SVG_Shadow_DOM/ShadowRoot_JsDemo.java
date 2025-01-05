package com.apurba.in.SVG_Shadow_DOM;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowRoot_JsDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();

        JavascriptExecutor js =(JavascriptExecutor)driver;
        WebElement div_to_Scroll = driver.findElement(By.xpath("//div[@id=\"userName\"]"));

        js.executeScript("arguments[0].scrollIntoView(true);",div_to_Scroll);
        Thread.sleep(30);
        WebElement inputboxPizza = (WebElement) js.executeScript("return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\");");
        // (script format: "return (Copy JS path);"
        inputboxPizza.sendKeys("farmhouse");
    }
}
