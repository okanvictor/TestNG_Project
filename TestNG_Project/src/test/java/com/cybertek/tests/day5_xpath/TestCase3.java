package com.cybertek.tests.day5_xpath;

import com.cybertek.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase3 {
    public static void main(String[] args) {
        /**
         * Go to wikipedia.org (Links to an external site.)
         * enter search term `selenium webdriver`
         * click on search button
         * click on search result `Selenium (software)`
         * verify url ends with `Selenium_(software
         */

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://wikipedia.org");
        WebElement searchBox=driver.findElement(By.xpath("//input[@id='searchInput']"));
        searchBox.sendKeys("selenium webdriver");

        WebElement search=driver.findElement(By.xpath("//i[@class='sprite svg-search-icon']"));
        search.click();

        WebElement result=driver.findElement(By.xpath("//a[@title='Selenium (software)']"));
        result.click();
        String expectedSearchUrl="Selenium_(software)";

        String actualSearchUrl=driver.getCurrentUrl();

        if (actualSearchUrl.substring(actualSearchUrl.length()-19,actualSearchUrl.length()).equals(expectedSearchUrl)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("expectedSearchUrl = " + expectedSearchUrl);
            System.out.println("actualSearchUrl = " + actualSearchUrl);
        }


    }
}
