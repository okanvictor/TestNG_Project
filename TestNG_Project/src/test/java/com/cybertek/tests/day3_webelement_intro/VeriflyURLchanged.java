package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VeriflyURLchanged {
    public static void main(String[] args) {
        /**
         * Verify URL not changed
         * open browser
         * go to http://practice.cybertekschool.com/forgot_password Links to an external site.
         * click on Retrieve password
         * verify that url did not change
         */

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

        String expectedURL="http://practice.cybertekschool.com/forgot_password";
        WebElement submitButton=driver.findElement(By.id("form_submit"));

        String currentUrl = driver.getCurrentUrl();

        if(expectedURL.equals(currentUrl)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expectedURL = " + expectedURL);
            System.out.println("currentUrl = " + currentUrl);
        }
    }
}
