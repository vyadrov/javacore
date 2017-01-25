package com.vyadrov.classwork.lesson20;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Rozetka {

    private FirefoxDriver webdriver;
    private String baseUrl = "http://rozetka.com.ua/";

    @Before
    public void setup () throws Exception {
        webdriver = new FirefoxDriver();
        webdriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @Test
    public void testCHeckTitle() {
        webdriver.get(baseUrl);
        webdriver.findElementByXPath(".//*[@id='body-header']/div[3]/div/div[2]/div[1]/img");
        //webdriver.findElementByLinkText("Интернет магазин Rozetka.ua");
    }

    @After
    public void quit() {
        webdriver.quit();
    }


}
