package com.apurba.in.Practice;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class N4 {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--Incognito");
        WebDriver driver = new ChromeDriver(option);
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();
        WebElement uploadfile = driver.findElement(By.xpath("//input[@id='file-upload']"));
        uploadfile.sendKeys("C:\\Users\\APURBA ACHARYA\\IdeaProjects\\LearningSeleniumATB9x\\src\\test\\java\\com\\apurba\\in\\ex11_Actions_Advance\\hello.txt");
        Thread.sleep(3000);
        WebElement upload1 = driver.findElement(By.xpath("//input[@id='file-submit']"));
        upload1.click();
        WebElement upload2 = driver.findElement(By.xpath("//h3[normalize-space()='File Uploaded!']"));
        Assert.assertEquals(upload2.getText(),"File Uploaded!");
        WebElement upload3 = driver.findElement(By.xpath("//div[@id='uploaded-files']"));
        System.out.println(upload3.getText());
        Thread.sleep(3000);

//        //Not able to proeed >>
//        driver.navigate().to("app-automate.browserstack.com/dashboard/v2/getting-started");
//        driver.manage().window().maximize();
//        WebElement username = driver.findElement(By.xpath("//input[@id='user_email_login']"));
//        username.sendKeys("xxxxxxxxxx");
//        WebElement password = driver.findElement(By.xpath("//input[@id='user_password']"));
//        password.sendKeys("xxxxxxxxxx");
//        WebElement signin = driver.findElement(By.xpath("//input[@id='user_submit']"));
//        signin.click();
//        WebDriverWait logo = new WebDriverWait(driver, Duration.ofSeconds(10));
//        logo.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='Browserstack logo']")));

    }
    }

