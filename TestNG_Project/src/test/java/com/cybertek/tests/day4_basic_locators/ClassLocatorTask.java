package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassLocatorTask {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement home=driver.findElement(By.className("nav-link"));
        home.click();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");
       // System.out.println(driver.findElement(By.tagName("h3")).getText());

        WebElement MultEl=driver.findElement(By.tagName("h3"));
        String msg=MultEl.getText();
        System.out.println(msg);

    }
}
