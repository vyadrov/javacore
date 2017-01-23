package com.vyadrov.classwork.lesson6;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class TestSelenium {
    private FirefoxDriver wd;

    @Before
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @Test
    public void Asd() {
        wd.get("http://kinosvit.tv/");
        wd.findElement(By.linkText("Трейлеры")).click();
        wd.findElement(By.linkText("Чужой: Завет / Alien: Covenant (2017) Скачать торрент")).click();
        wd.findElement(By.linkText("Боевики")).click();
        wd.findElement(By.linkText("Смертельное оружие / Lethal Weapon (2016) Скачать торрент")).click();
    }

    @After
    public void tearDown() {
        wd.quit();
    }

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
