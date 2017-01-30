package com.vyadrov.classwork.lesson20;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by vyadrov on 1/30/17.
 */
public class TestRozetka {
    private FirefoxDriver driver;
    private String baseUrl = "http://rozetka.com.ua/";
    //private String baseUrl2 = "http://www.fast-torrent.ru/";
    WebElement webElement;

    @Before
    public void setup () throws Exception {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS.SECONDS);
    }
    @Test
    public void testCheckTitle() {
        driver.get(baseUrl);
        driver.findElementByCssSelector(".logo>img");
    }
    @Test
    public void testSearch() {
        driver.get(baseUrl);
        webElement = driver.findElementByCssSelector(".rz-header-search-input-text.passive");
        webElement.click();
        webElement.sendKeys("iphone 6s plus");
        webElement = driver.findElementByLinkText("iphone 6s plus 128gb");
        webElement.click();


    }

    @After
    public void quit() {
        driver.quit();
    }
}
