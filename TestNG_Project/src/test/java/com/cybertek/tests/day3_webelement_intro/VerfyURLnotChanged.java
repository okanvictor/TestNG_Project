package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utulities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerfyURLnotChanged {

    public static void main(String[] args) {
        /**
         *Verify URL not changed
         * open browser
         * go to http://practice.cybertekschool.com/forgot_passwordLinks to an external site.
         * click on Retrieve password
         * verify that url did not change
         */
        WebDriver driver=WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

        String expectedUrl=driver.getCurrentUrl();

        WebElement retrivePAswordButton=driver.findElement(By.id("form_submit"));
        retrivePAswordButton.click();

        String actualUrl=driver.getCurrentUrl();

        if(expectedUrl.equals(actualUrl)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }


    }
}
