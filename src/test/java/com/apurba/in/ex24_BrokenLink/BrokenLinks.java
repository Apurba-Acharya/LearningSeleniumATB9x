package com.apurba.in.ex24_BrokenLink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenLinks {
    public static void main(String[] args) throws InterruptedException, IOException {

        ChromeOptions option = new ChromeOptions();
        option.addArguments("--headless");

        WebDriver driver = new ChromeDriver(option);
        driver.get("https://www.flipkart.in/");

        Thread.sleep(5000);
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total links: " + links.size());

        for (WebElement e : links) {
            String url = e.getAttribute("href");
            System.out.println("--------------------- " + url + " ----------------------");

            if (url == null || url.isEmpty()) {
                System.out.println("This URL is empty <> Dummy URL : " + url);
                continue;
            }

            try {
                URL Url = new URL(url);
                HttpURLConnection httpUrlConnection = (HttpURLConnection) (Url.openConnection());
                httpUrlConnection.connect();

                httpUrlConnection.setConnectTimeout(5000);
                if (httpUrlConnection.getResponseCode() >= 400) {
                    System.out.println("link is broken: --- "+httpUrlConnection.getResponseMessage()+"---"+httpUrlConnection.getResponseCode()+"---"+url);
                } else {
                    System.out.println("link is valid: --- "+httpUrlConnection.getResponseMessage()+"---"+httpUrlConnection.getResponseCode()+"---"+url);
                }
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
        driver.quit();
    }
}