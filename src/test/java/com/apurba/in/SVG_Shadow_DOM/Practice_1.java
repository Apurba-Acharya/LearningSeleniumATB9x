package com.apurba.in.SVG_Shadow_DOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Practice_1 {
    @Test
     public void set1() throws InterruptedException {
     WebDriver driver = new EdgeDriver();
     driver.get("https://www.amcharts.com/svg-maps/?map=india");
     driver.manage().window().maximize();
     Thread.sleep(5);
     driver.findElement(By.xpath("//input[@type=\"button\"]")).click();
     WebElement wb = driver.findElement(By.xpath("//div[@class='amcharts-chart-div']//*[name()='svg']//*[name()='g']//*[name()='g' and contains(@transform,'translate(')]//*[name()='g' and contains(@transform,'translate(')]//*[name()='path'][@aria-label='Puducherry  ']"));
     Thread.sleep(5);
     wb.click();
    }
}
