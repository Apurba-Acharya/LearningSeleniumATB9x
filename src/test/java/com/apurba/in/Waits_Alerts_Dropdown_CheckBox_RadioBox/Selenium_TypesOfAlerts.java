package com.apurba.in.Waits_Alerts_Dropdown_CheckBox_RadioBox;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Selenium_TypesOfAlerts {
    public static void main(String[] args) {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        WebElement jsAlert = driver.findElement(By.xpath("//button[@onClick=\"jsAlert()\"]"));
        jsAlert.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        WebElement result1 = driver.findElement(By.xpath("//p[@id=\"result\"]"));
        Assert.assertEquals(result1.getText(),"You successfully clicked an alert");

        WebElement jsConfirm = driver.findElement(By.xpath("//button[@onClick=\"jsConfirm()\"]"));
        jsConfirm.click();
        Alert alert1 = driver.switchTo().alert();
        alert1.accept();
        WebElement result2 = driver.findElement(By.xpath("//p[@id=\"result\"]"));
        Assert.assertEquals(result2.getText(),"You clicked: Ok");

        WebElement jsPrompt = driver.findElement(By.xpath("//button[@onClick=\"jsPrompt()\"]"));
        jsPrompt.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert2 = driver.switchTo().alert();
        alert2.sendKeys("ATB9x");
        alert2.accept();
        WebElement result3 = driver.findElement(By.xpath("//p[@id=\"result\"]"));
        Assert.assertEquals(result3.getText(),"You entered: ATB9x");
    }
}