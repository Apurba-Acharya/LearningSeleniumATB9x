package com.apurba.in.ex06_Selenium_Xpath;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class flipkart {
    @Test
    public void flip() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[contains(text(), \"Click for JS P\")]")).click();
        Thread.sleep(3000);
        Alert a1 = driver.switchTo().alert();
        a1.sendKeys("Sunitha");
        Thread.sleep(3000);
        a1.accept();
        WebElement result = driver.findElement(By.xpath("//p[@id=\"result\"]"));
        Assert.assertEquals(result.getText(),"You entered: Sunitha");
    }
}
