package org.seleniumhq.example.model;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractWebPage implements WebPage {
    
    @Autowired 
    protected WebDriver webDriver;
    
    public void closePage() {
        webDriver.close();
    }

    public void quitBrowser() {
        webDriver.quit();
    }

}
