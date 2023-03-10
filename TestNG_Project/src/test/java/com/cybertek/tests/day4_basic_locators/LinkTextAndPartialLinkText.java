package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkTextAndPartialLinkText {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dynamic_loading");

       // WebElement link3=driver.findElement(By.linkText("http://practice.cybertekschool.com/dynamic_loading"));
       // link3.click();

        WebElement link2=driver.findElement(By.partialLinkText("6"));
        link2.click();
    }
}
