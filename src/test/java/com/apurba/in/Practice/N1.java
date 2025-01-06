package com.apurba.in.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class N1 {
    @Test
    public void N2(){
        WebDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/webtable1.html");
        driver.manage().window().maximize();
        WebElement table = driver.findElement(By.xpath("//table[@summary='Sample Table']"));
        List <WebElement> row = driver.findElements(By.tagName("tr"));
        for (int i = 1; i <=row.size(); i++) {
            List <WebElement> col = row.get(i).findElements(By.xpath("//tbody/tr/td"));
            for (WebElement c:col) {
                System.out.println(c.getText());
            }
        }
    }
}

