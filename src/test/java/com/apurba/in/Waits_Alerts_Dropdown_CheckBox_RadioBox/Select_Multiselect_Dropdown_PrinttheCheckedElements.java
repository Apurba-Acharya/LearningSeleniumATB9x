package com.apurba.in.Waits_Alerts_Dropdown_CheckBox_RadioBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class Select_Multiselect_Dropdown_PrinttheCheckedElements {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://admirhodzic.github.io/multiselect-dropdown/demo.html");

        driver.findElement(By.xpath("//div[@class=\"multiselect-dropdown\"][1]")).click();
        List<WebElement> element_select = driver.findElements(By.xpath("//div[@class=\"multiselect-dropdown\"][1]/div/div/div"));
        for (WebElement element : element_select){
            //System.out.println(element.getAttribute("class"));
            if(element.getAttribute("class").equals("checked")){
                System.out.println(element.getText());
            }
        }
    }
}
