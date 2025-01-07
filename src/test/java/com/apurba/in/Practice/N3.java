package com.apurba.in.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class N3 {
    @Test
    public void n3() throws InterruptedException {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--Incognito");
        WebDriver driver = new ChromeDriver(option);
        driver.get("https://www.makemytrip.com/");
        //Thread.sleep(3000);
        //implicit wait >> driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        //explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy=\"closeModal\"]")));
        WebElement element = driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]"));
        element.click();

    }
}
