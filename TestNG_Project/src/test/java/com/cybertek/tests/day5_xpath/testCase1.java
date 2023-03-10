package com.cybertek.tests.day5_xpath;

import com.cybertek.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class testCase1 {
    public static void main(String[] args) {
        /**
         * Go to ebay
         * enter search term
         * click on search button
         * print number of results
         */

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://ebay.com");

        WebElement searchBox=driver.findElement(By.xpath("//input[@type='text']"));
        searchBox.sendKeys("books");

        WebElement search=driver.findElement(By.xpath("//input[@type='submit']"));
        search.click();

        String searchResult=driver.findElement(By.xpath("//h1[@class='srp-controls__count-heading']")).getText();

        System.out.println(searchResult);

        driver.close();

    }
}
