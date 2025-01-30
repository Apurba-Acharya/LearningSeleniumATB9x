package com.apurba.in.ex11_Actions_Advance_FileUpload_DragDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class test30_Actions_Scrolling {
    @Test
    public void p5() throws InterruptedException {
//         EdgeOptions Options = new EdgeOptions();
//         Options.addArguments("--InPrivate");
//
////        ChromeOptions Options = new ChromeOptions();
////        Options.addArguments("--Ingognito");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.makemytrip.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='commonModal__close']")));
        driver.manage().window().maximize();
        WebElement cross = driver.findElement(By.xpath("//span[@class=\"commonModal__close\"]"));
        cross.click();

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();
        System.out.println("---------Scroll Down!!!---------");
    }
}