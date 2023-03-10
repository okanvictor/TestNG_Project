package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyURLnotchanged {
    public static void main(String[] args) {
        /**
         * Verify URL changed
         * open browser
         * go to http://practice.cybertekschool.com/forgot_passwordLinks to an external site.
         * enter any email
         * click on Retrieve password
         * verify that url changed to http://practice.cybertekschool.com/email_sent
         */

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement mailInput=driver.findElement(By.name("email"));
        mailInput.sendKeys("email@gmail.com");

        String expectedURL="http://practice.cybertekschool.com/email_sent";
        WebElement retriveButton=driver.findElement(By.id("form_submit"));
        retriveButton.click();
        String actualURL=driver.getCurrentUrl();

        if(actualURL.equals(expectedURL)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("actualURL = " + actualURL);
            System.out.println("expectedURL = " + expectedURL);
        }
    }
}
