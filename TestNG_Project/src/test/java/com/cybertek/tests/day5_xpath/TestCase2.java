package com.cybertek.tests.day5_xpath;

import com.cybertek.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase2 {
    public static void main(String[] args) {
        /**
         * go to amazon
         * Go to ebay
         * enter search term
         * click on search button
         * verify title contains search term
         */

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("https://amazon.com");
        driver.get("https://ebay.com");

        WebElement searchBox=driver.findElement(By.xpath("//input[@type='text']"));
        searchBox.sendKeys("books");

        WebElement search=driver.findElement(By.xpath("//input[@type='submit']"));
        search.click();

        String actualWord=driver.getTitle();

       System.out.println("title is: "+ actualWord);

       String expectedWord="books";

       if(actualWord.contains(expectedWord)){
           System.out.println("Pass");
       }else{
           System.out.println("Fail");
           System.out.println("actualWord = " + actualWord);
           System.out.println("expectedWord = " + expectedWord);
       }

    }
}
