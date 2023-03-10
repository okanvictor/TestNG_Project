package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyURLchanged {
    public static void main(String[] args) {
        /**
         * Verify URL changed
         * open browser
         * go to http://practice.cybertekschool.com/forgot_password Links to an external site.
         * enter any email
         * click on Retrieve password
         * verify that url changed to http://practice.cybertekschool.com/email_sent
         */

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement emailInput=driver.findElement(By.name("email"));

        emailInput.sendKeys("email@gmail.com");

        WebElement retrivePassButton=driver.findElement(By.id("form_submit"));

        retrivePassButton.click();

        String actualURL="http://practice.cybertekschool.com/email_sents";
        String expectedUrl=driver.getCurrentUrl();

        if(expectedUrl.equals(actualURL)){
            System.out.println("Pass");
        }else{
            System.out.println("fail");
            System.out.println("expectedUrl = " + expectedUrl);
            System.out.println("actualURL = " + actualURL);
        }

    }
}
