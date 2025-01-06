package com.apurba.in.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class N2 {
    @Test
    public void N2() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/hr/web/index.php/pim/viewEmployeeList");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
        username.sendKeys("admin");
        WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
        password.sendKeys("Hacker@4321");
        WebElement login = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        login.click();

        WebElement table = driver.findElement(By.xpath("//div[@class='oxd-table-body']"));
        List<WebElement> rows = driver.findElements(By.xpath("//div[@class='oxd-table-body']/div"));
        for (int i = 0; i < rows.size(); i++) {
            List <WebElement> col = rows.get(i).findElements(By.xpath("//div[@class='oxd-table-body']/div/div[1]/div[1]/div"));
            for (WebElement c : col){
                System.out.println(c.getText());
            }
        }
    }
}

