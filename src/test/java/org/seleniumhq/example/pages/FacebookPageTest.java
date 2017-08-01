package org.seleniumhq.example.pages;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class FacebookPageTest {
    
    private static WebDriver webDriver;

    private static FacebookPage facebook;
    
    @BeforeClass
    public static void setupPage() {
        ChromeDriverManager.getInstance().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        facebook = new FacebookPage(webDriver);
    }
    
    @Test
    public void testLogIn() throws Exception {
        facebook.openPage();
        facebook.setUserEmail("qkv47689@tqosi.com");
        facebook.setUserPassword("Ender123");
        facebook.clickLogIn();

        Assert.assertTrue(facebook.isLoggedIn());
    }
    
    @AfterClass
    public static void quitBrowser() {
        facebook.quitBrowser();
    }
    
}
