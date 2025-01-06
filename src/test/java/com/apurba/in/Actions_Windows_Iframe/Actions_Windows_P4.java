package com.apurba.in.Actions_Windows_Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class Actions_Windows_P4 {
    @Test
    public void p4() throws InterruptedException {
//         EdgeOptions Options = new EdgeOptions();
//         Options.addArguments("--InPrivate");
//
////        ChromeOptions Options = new ChromeOptions();
////        Options.addArguments("--Ingognito");
        WebDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.manage().window().maximize();

        //window handle >>
        String parentwindow = driver.getWindowHandle();
        System.out.println("Parent window: " + parentwindow);

        //window handles >>
        driver.findElement(By.xpath("//a[normalize-space()='Click Here']")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println("window handles: " + windowHandles);

        for (String handle : windowHandles){
            driver.switchTo().window(handle);
            if(driver.getPageSource().contains("New Window")){
                System.out.println("----------Passed!----------");
            }
        }
    }
}
