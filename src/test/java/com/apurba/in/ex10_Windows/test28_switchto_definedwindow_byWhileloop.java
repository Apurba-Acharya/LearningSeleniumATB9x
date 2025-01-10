package com.apurba.in.ex10_Windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class test28_switchto_definedwindow_byWhileloop {
    @Test
    public void window_popup_modal() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[@href=\"https://www.linkedin.com/company/orangehrm/mycompany/\"]/*[name()='svg']")).click();
        driver.findElement(By.xpath("//a[@href=\"https://twitter.com/orangehrm?lang=en\"]/*[name()='svg']")).click();
        driver.findElement(By.xpath("//a[@href='https://www.youtube.com/c/OrangeHRMInc']//*[name()='svg']")).click();

        Thread.sleep(3000);

        String parent = driver.getWindowHandle();
        //System.out.println(parent);

        Set <String> windows = driver.getWindowHandles();
        Iterator <String> iterator = windows.iterator();
        while (iterator.hasNext()){
            String childwindow = iterator.next();
            //System.out.println(childwindow);
            if (!childwindow.equalsIgnoreCase(parent)){
                driver.switchTo().window(childwindow);
                if (driver.getCurrentUrl().equals("https://www.youtube.com/c/OrangeHRMInc")){
                    //driver.findElement(By.xpath("//icon[contains(@class,'contextual-sign-in-modal__modal-dismiss-icon lazy-loaded')]//*[name()='svg']")).click();
                    driver.findElement(By.xpath("//button[@aria-label=\"Subscribe\"]/yt-touch-feedback-shape/div/div[2]")).click();
                    Thread.sleep(10000);
                }
                driver.switchTo().window(parent);
            }
        }
    }
}
