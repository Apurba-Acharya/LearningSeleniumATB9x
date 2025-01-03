package com.apurba.in.ex06_Selenium_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class makemytripPractice_3 {
    @Test
    public void p3() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement cross = driver.findElement(By.xpath("//span[@class=\"commonModal__close\"]"));
        cross.click();
        Thread.sleep(3000);
        WebElement fromcity1 = driver.findElement(By.xpath("//*[@id=\"fromCity\"]"));
        fromcity1.click();
        Thread.sleep(3000);
        /* or >> WebElement fromcity2 = driver.findElement(By.xpath("//input[@aria-autocomplete=\"list\" and @placeholder=\"From\"]"));
                 fromcity2.sendKeys("kolkata");
           or >> WebElement fromcity2 = driver.findElement(By.xpath("//ul[@class=\"react-autosuggest__suggestions-list\"]/li[7]/div[1]/div[1]/div[1]/div[1]/div[1]/p[1]")); */
        WebElement fromcity2 = driver.findElement(By.xpath("//ul[@class=\"react-autosuggest__suggestions-list\"]/li[7]"));
        fromcity2.click();

    }
}
