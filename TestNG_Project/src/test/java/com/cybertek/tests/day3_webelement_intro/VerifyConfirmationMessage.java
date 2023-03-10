package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyConfirmationMessage {
    public static void main(String[] args) {
        /**
         * Verify confirmation message
         * open browser
         * go to http://practice.cybertekschool.com/forgot_passwordLinks to an external site.
         * enter any email
         * verify that email is displayed in the input box
         * click on Retrieve password
         * verify that confirmation message says 'Your e-mail's been sent!'
         */

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get(" http://practice.cybertekschool.com/forgot_password");

        String expectedMail="email@mail.com";
        WebElement mailInput=driver.findElement(By.name("email"));
        mailInput.sendKeys("email@mail.com");
        String actualMail=mailInput.getAttribute("value");

        if (actualMail.equals(expectedMail)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expectedMail = " + expectedMail);
            System.out.println("actualMail = " + actualMail);
        }

        WebElement retriveButton=driver.findElement(By.id("form_submit"));
        retriveButton.click();
        String expectedMSG="Your e-mail's been sent!";
        WebElement mesage=driver.findElement(By.name("confirmation_message"));
        String actualMSG=mesage.getText();

        if(actualMSG.equals(expectedMSG)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expectedMSG = " + expectedMSG);
            System.out.println("actualMSG = " + actualMSG);
        }


    }


}
