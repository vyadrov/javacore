//package com.vyadrov.app.utils.classwork.lesson19;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.AfterClass;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
//import java.util.concurrent.TimeUnit;
//import java.util.Date;
//import java.io.File;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.*;
//import static org.openqa.selenium.OutputType.*;
//
//public class Asd {
//    FirefoxDriver wd;
//
//    @Before
//    public void setUp() throws Exception {
//        wd = new FirefoxDriver();
//        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//    }
//
//    @Test
//    public void Asd() {
//        wd.get("http://kinosvit.tv/");
//        wd.findElement(By.linkText("Трейлеры")).click();
//        wd.findElement(By.linkText("Чужой: Завет / Alien: Covenant (2017) Скачать торрент")).click();
//        wd.findElement(By.linkText("Боевики")).click();
//        wd.findElement(By.linkText("Смертельное оружие / Lethal Weapon (2016) Скачать торрент")).click();
//    }
//
//    @After
//    public void tearDown() {
//        wd.quit();
//    }
//
//    public static boolean isAlertPresent(FirefoxDriver wd) {
//        try {
//            wd.switchTo().alert();
//            return true;
//        } catch (NoAlertPresentException e) {
//            return false;
//        }
//    }
//}
