package com.apurba.in.SVG_Shadow_DOM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Practice_ShadowRoot1 {
    @Test
     public void set1() throws InterruptedException {
     WebDriver driver = new EdgeDriver();
     driver.get("https://www.htmlelements.com/demos/menu/shadow-dom/index.htm");
     Thread.sleep(5000);
     driver.manage().window().maximize();


     JavascriptExecutor js = (JavascriptExecutor)driver;
     WebElement scroll = driver.findElement(By.xpath("//smart-ui-menu[@class=\"smart-ui-component\"]"));

     WebElement dropdown = (WebElement) js.executeScript("return document.querySelector(\"body > smart-ui-menu\").shadowRoot.querySelector(\"#menuItemsGroup7fb7 > div.smart-menu-item-label-container > div.smart-menu-items-group-arrow.down.smart-arrow-down\");");
     Assert.assertEquals(dropdown.getText(),"");
    }
}
