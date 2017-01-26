package com.vyadrov.classwork.lesson20;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Rozetka {

    private FirefoxDriver driver;
    private String baseUrl = "http://rozetka.com.ua/";
    //private String baseUrl2 = "http://www.fast-torrent.ru/";
    WebElement webElement;

    @Before
    public void setup () throws Exception {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

   /* @Test
    public void testCheckTitle() {
        driver.get(baseUrl);
        driver.findElementByXPath("./*//*[@id='head_banner_container']/div/div[3]/div/div/div[1]/div[1]/div[1]/ul/li[2]/a");
        driver.findElementByLinkText("Корзина");
    }*/
    @Test
    public void testSearch() {
        driver.get(baseUrl);
        webElement = driver.findElementByCssSelector(".rz-header-search-input-text.passive");
        webElement.click();
        webElement.sendKeys("iphone 6s");
        webElement = driver.findElementByName("2");
        //webElement = driver.findElementByLinkText("iphone 6s");
        webElement.click();

    }

    /*@After
    public void quit() {
        driver.quit();
    }*/


}
