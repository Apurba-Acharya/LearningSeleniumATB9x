package com.ex24_BrokenLink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class B_P {
    public static void main(String[] args) throws MalformedURLException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.in/");
        List <WebElement> links  = driver.findElements(By.tagName("a"));
        for (WebElement e : links){
            String url = e.getAttribute("href");
            System.out.println(url);
            if (url == null || url.isEmpty()){
                System.out.println("Broken: " + url);
                continue;
            }
            try {
                URL Url = new URL(url);
                HttpURLConnection httpURLConnection = (HttpURLConnection) (Url.openConnection());
                httpURLConnection.connect();
                httpURLConnection.setConnectTimeout(5000);
                if (httpURLConnection.getResponseCode() >= 400){
                    System.out.println("Broken :" + httpURLConnection.getResponseCode() + httpURLConnection.getResponseMessage());
                }else {
                    System.out.println("valid : " + httpURLConnection.getResponseMessage());
                }
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }



    }
}
