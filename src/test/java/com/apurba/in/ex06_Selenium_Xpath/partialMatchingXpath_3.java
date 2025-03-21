package com.apurba.in.ex06_Selenium_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class partialMatchingXpath_3 {
    @Test
    public void p3() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[@class=\"commonModal__close\"]")).click();
        Thread.sleep(3000);

        // Using contains attribute: //tagname[contains(@attribute, " ")]
        driver.findElement(By.xpath("//a[contains(@href, 'https://www.makemytrip.com/holidays-india/')]")).getText();

        // Using contains text: //tagname[contains(text(), " ")]
        driver.findElement(By.xpath("//span[contains(text(), \"BOM, Chhatrapati\")]")).getText();

        driver.findElement(By.xpath("//*[@id=\"fromCity\"]")).click();
        /* or >> WebElement fromcity2 = driver.findElement(By.xpath("//input[@aria-autocomplete=\"list\" and @placeholder=\"From\"]"));
                 fromcity2.sendKeys("kolkata");
           or >> WebElement fromcity2 = driver.findElement(By.xpath("//ul[@class=\"react-autosuggest__suggestions-list\"]/li[7]/div[1]/div[1]/div[1]/div[1]/div[1]/p[1]")); */
        WebElement fromcity2 = driver.findElement(By.xpath("//ul[@class=\"react-autosuggest__suggestions-list\"]/li[7]"));
        fromcity2.click();

    }
}
