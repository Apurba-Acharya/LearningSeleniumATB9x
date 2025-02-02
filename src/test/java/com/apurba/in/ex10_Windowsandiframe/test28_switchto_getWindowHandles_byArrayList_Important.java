package com.apurba.in.ex10_Windowsandiframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class test28_switchto_getWindowHandles_byArrayList_Important {
    @Test
    public void window_popup_modal() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login"); // Position: 0th //using tab.size(): 0st
        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[@href=\"https://www.linkedin.com/company/orangehrm/mycompany/\"]/*[name()='svg']")).click(); //Position: 3rd //using tab.size():3rd
        driver.findElement(By.xpath("//a[@href=\"https://twitter.com/orangehrm?lang=en\"]/*[name()='svg']")).click(); //Position: 2nd //using tab.size(): 2nd
        driver.findElement(By.xpath("//a[@href='https://www.youtube.com/c/OrangeHRMInc']//*[name()='svg']")).click(); //Position: 1st //using tab.size(): 1st

        String window = driver.getWindowHandle();
        System.out.println("Parent window ID: " + window);

        Set <String> windows = driver.getWindowHandles();
        // The last window opening in browser that will be 1st position storing in "tabs" object reference.
        // and the second last window will be 2nd position storing in "tabs" object reference and then it will continue till end.
        // Parent will be always 0.
        List <String> tabs = new ArrayList<>(windows);
        driver.switchTo().window(tabs.get(0));
        System.out.println("Title of Child0 window is: " + driver.getCurrentUrl());
        driver.switchTo().window(tabs.get(1));
        System.out.println("Title of Child1 window is: " + driver.getCurrentUrl());
        driver.switchTo().window(tabs.get(2));
        System.out.println("Title of Child2 window is: " + driver.getCurrentUrl());
        driver.switchTo().window(tabs.get(3));
        System.out.println("Title of Child3 window is: " + driver.getCurrentUrl());
        System.out.println("Following windows are gettting in an array: " + tabs);
        Thread.sleep(5000);

        driver.switchTo().window(tabs.get(2));
        System.out.println("Title of Child1 window is: " + driver.getTitle());
        Thread.sleep(3000);
        driver.close();

        driver.switchTo().window(tabs.get(1));
        System.out.println("Title of Child2 window is: " + driver.getTitle());
        driver.findElement(By.xpath("//button[@aria-label=\"Subscribe\"]/yt-touch-feedback-shape/div/div[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//ytd-button-renderer[@id=\"button\"]/yt-button-shape/a/yt-touch-feedback-shape/div/div[2]")).click();
        Thread.sleep(3000);
        driver.close();

        driver.switchTo().window(tabs.get(0));
        System.out.println("Title of Child3 window is: " + driver.getTitle());
        Thread.sleep(3000);
        driver.close();

        driver.switchTo().window(tabs.get(3));
        Thread.sleep(3000);
        System.out.println("Title of Child4 window is: " + driver.getTitle());
        driver.quit();

        //Switch to a perticuler window using for loop
//        Thread.sleep(7000);
//        for (int i=1; i<=tabs.size(); i++){
//            if (i==1){
//                driver.switchTo().window(tabs.get(i));
//                System.out.println("Tab title is: " + driver.getTitle());
//                driver.close();
//            }
//        }
    }
}
