package com.apurba.in.ex10_Windowsandiframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class test28_switchto_getWindowHandles_byArrayList_Important {
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

        String window = driver.getWindowHandle();
        System.out.println("Parent window ID: " + window);

        Set<String> windows = driver.getWindowHandles();
        ArrayList<String> tabs = new ArrayList<>(windows);
        System.out.println("Following windows are gettting in an array: " + tabs);
        Thread.sleep(3000);

        driver.switchTo().window(tabs.get(1));
        System.out.println("Title of Child1 window is: " + driver.getTitle());
        Thread.sleep(3000);
        driver.close();

        driver.switchTo().window(tabs.get(2));
        System.out.println("Title of Child2 window is: " + driver.getTitle());
        driver.findElement(By.xpath("//button[@aria-label=\"Subscribe\"]/yt-touch-feedback-shape/div/div[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//ytd-button-renderer[@id=\"button\"]/yt-button-shape/a/yt-touch-feedback-shape/div/div[2]")).click();
        Thread.sleep(3000);
        driver.close();

        driver.switchTo().window(tabs.get(3));
        System.out.println("Title of Child3 window is: " + driver.getTitle());
        Thread.sleep(3000);
        driver.close();

        driver.switchTo().window(tabs.get(0));
        Thread.sleep(3000);
        System.out.println("Title of parent window is: " + driver.getTitle());
        driver.close();
    }
}
