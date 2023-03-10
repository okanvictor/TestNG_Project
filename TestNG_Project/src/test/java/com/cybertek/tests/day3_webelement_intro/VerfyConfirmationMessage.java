package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerfyConfirmationMessage {
    public static void main(String[] args) throws InterruptedException {
        /**
         * Verify confirmation message
         * open browser
         * go to http://practice.cybertekschool.com/forgot_password Links to an external site.
         * enter any email
         * verify that email is displayed in the input box
         * click on Retrieve password
         * verify that confirmation message says ‘Your e-mail’s been sent!’
         */

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement passInput=driver.findElement(By.name("email"));
        passInput.sendKeys("email@gmail.com");

        //String actualEmail=emailInputBox.getText();

        String expectedMail="email@gmail.com";
        String actualEmail=passInput.getAttribute("value");


        if(expectedMail.equals(actualEmail)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("actualEmail = " + actualEmail);
            System.out.println("expectedMail = " + expectedMail);
        }

        WebElement retrivePassButton=driver.findElement(By.id("form_submit"));
        retrivePassButton.click();

        String expectedMsg="Your e-mail's been sent!";

        WebElement msgElement=driver.findElement(By.name("confirmation_message"));

        String actualMsg=msgElement.getText();

        if(expectedMsg.equals(actualMsg)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("actualMsg = " + actualMsg);
            System.out.println("expected msg = " + expectedMsg);
        }

        Thread.sleep(3000);
        driver.close();

    }
}
