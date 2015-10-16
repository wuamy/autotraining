package org.amy.training.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Review the basic auto-structure
 * 10/16/2015
 */
public class FirstTestCase {
    public static void main(String[] args){
        //create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //launch the online store Website
        driver.get("http://store.demoqa.com/");

        //print a log in message to the screen
        System.out.println("successfully opened the website!");

        //click the login icon
        driver.findElement(By.xpath(".//*[@id='account']/a")).click();

        // enter user name
        driver.findElement(By.id("log")).sendKeys("");

        // enter user password
        driver.findElement(By.id("pwd")).sendKeys("");

        //wait for a couple of second
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //log out
        driver.findElement(By.xpath(".//*[@id='meta']/ul/li[2]/a")).click();

        //wait for a couple of second and see the log out page
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //Close the driver
        driver.quit();

    }
}
