package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {
    public static void main(String[] args) throws InterruptedException {
     WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
 /*
        driver.get("https://practice.cybertekschool.com");*/

        driver.get("http://practice.cybertekschool.com/open_new_tab");
        Thread.sleep(6000);
        driver.quit();

    }


}
