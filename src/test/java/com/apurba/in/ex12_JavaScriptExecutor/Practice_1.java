package com.apurba.in.ex12_JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Practice_1 {
    @Test
     public void set1() throws InterruptedException {
     WebDriver driver = new EdgeDriver();
     driver.get("https://www.htmlelements.com/demos/menu/shadow-dom/index.htm");
     driver.manage().window().maximize();
     Thread.sleep(5000);
     WebElement element = driver.findElement(By.xpath("//smart-ui-menu[@class='smart-ui-component']"));
     JavascriptExecutor js = (JavascriptExecutor) driver;
//     js.executeScript("window.scrollBy(0, 500);");
//     Thread.sleep(6000);
     WebElement shop = (WebElement) js.executeScript("return document.querySelector(\"body > smart-ui-menu\").shadowRoot.querySelector(\"#menuItemsGroupfb42 > div.smart-menu-item-label-container\");");
        Actions action = new Actions(driver);
        action.moveToElement(shop).click();

    }
}
