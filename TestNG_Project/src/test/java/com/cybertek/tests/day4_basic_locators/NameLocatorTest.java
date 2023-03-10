package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NameLocatorTest {

    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement Name=driver.findElement(By.name("full_name"));
        Name.sendKeys("cyber burger");

        WebElement emailButton=driver.findElement(By.name("email"));
        emailButton.sendKeys("cyber@burger.com");

        WebElement signButton=driver.findElement(By.name("wooden_spoon"));
        signButton.click();

        String expectedMSG="Thank you for signing up. Click the button below to return to the home page. ";
        WebElement mesage=driver.findElement(By.name("signup_message"));
        String actualMSG=mesage.getText();


        if(actualMSG.equals(expectedMSG)){
            System.out.println("Pass");
        }else{
            System.out.println("fail");
            System.out.println("expectedMSG = " + expectedMSG);
            System.out.println("actualMSG = " + actualMSG);
        }

    }
}
