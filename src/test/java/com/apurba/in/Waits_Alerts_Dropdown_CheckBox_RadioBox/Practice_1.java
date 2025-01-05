package com.apurba.in.Waits_Alerts_Dropdown_CheckBox_RadioBox;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Practice_1 {
    @Test
    public void dropdown_valuetype() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        WebElement js = driver.findElement(By.xpath("//button[@onClick=\"jsPrompt()\"]"));
        js.click();
        Alert a1 = driver.switchTo().alert();
        a1.sendKeys("ATB9x");
        a1.accept();
    }
}
