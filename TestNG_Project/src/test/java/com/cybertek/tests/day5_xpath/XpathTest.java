package com.cybertek.tests.day5_xpath;

import com.cybertek.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.Arrays;

public class XpathTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://www.amazon.de");

        WebElement searchBar=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchBar.sendKeys("Selenium");
        WebElement searchSubmit=driver.findElement(By.xpath("//input[@value='Los']"));
        searchSubmit.click();

        Thread.sleep(3000);
        WebElement resultText = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/span"));

        String text=resultText.getText();

        String[] splitText=text.split(" ");

        int expectedSearcResult=50000;

        String actualResult=splitText[4];

        String str=splitText[4];

        String num=str.replace(".","");

        int actualSearchResult=Integer.parseInt(num);

        if(actualSearchResult>expectedSearcResult){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("Expected Search Result = " + expectedSearcResult);
            System.out.println("Actual Search Result = " + actualSearchResult);
        }


    }
}
