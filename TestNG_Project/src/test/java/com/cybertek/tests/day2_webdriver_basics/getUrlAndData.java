package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getUrlAndData {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        driver.get("https://practice.cybertekschool.com");

        //get Title
        String title=driver.getTitle();
        System.out.println("title = " + title);

        // current URL
        String currentUrl=driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        // get page source
        String pageSource=driver.getPageSource();
        System.out.println("pageSource = " + pageSource);

    }
}
