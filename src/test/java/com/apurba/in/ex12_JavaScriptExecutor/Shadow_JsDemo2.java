package com.apurba.in.ex12_JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shadow_JsDemo2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor)driver;
//        WebElement element = driver.findElement(By.xpath("//h2[normalize-space()='Bottom Modal']"));
//        js.executeScript("arguments[0].scrollIntoView(true);",element);
        js.executeScript("window.scrollBy(0, 500);");
        String url = js.executeScript("return document.URL;").toString();
        String title = js.executeScript("return document.title;").toString();
        System.out.println(url);
        System.out.println(title);
    }
}
