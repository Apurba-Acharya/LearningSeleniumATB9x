package com.apurba.in.ex09_ActionsClass;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import org.testng.annotations.Test;

import javax.lang.model.element.Element;
import java.util.Set;

public class Practice_1 {
    @Test
    public void p1() throws InterruptedException {
//        EdgeOptions eo = new EdgeOptions();
//        eo.addArguments("--InPrivate");
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.automationtesting.in/Frames.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
        //Nested iframe >>
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']")));
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[normalize-space()='<p>Your browser does not support iframes.</p>']")));
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ABSGHJJSHGH");

    }
}
