package com.apurba.in.ex10_Windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class test28_switchto_definedwindow_byforloop {
    @Test
    public void window_popup_modal() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[@href='https://www.youtube.com/c/OrangeHRMInc']//*[name()='svg']")).click();
        driver.findElement(By.xpath("//a[@href=\"https://www.linkedin.com/company/orangehrm/mycompany/\"]/*[name()='svg']")).click();
        driver.findElement(By.xpath("//a[@href=\"https://twitter.com/orangehrm?lang=en\"]/*[name()='svg']")).click();
        Thread.sleep(7000);

        String parent = driver.getWindowHandle();
        //System.out.println(parent);

        Set <String> windows = driver.getWindowHandles();
        for (String w : windows){
            //System.out.println(s);
            if(!w.equals(parent)){
                String s = driver.switchTo().window(w).getTitle();
                System.out.println(s);
                if (driver.getPageSource().contains("OrangeHRM Inc - YouTube")){
                    driver.findElement(By.xpath("//button[@aria-label=\"Subscribe\"]/yt-touch-feedback-shape/div/div[2]")).click();
                    driver.findElement(By.xpath("//ytd-button-renderer[@id=\"button\"]/yt-button-shape/a/yt-touch-feedback-shape/div/div[2]")).click();
                    Thread.sleep(10000);
                }
                driver.switchTo().window(parent);
            }
        }
    }
}
