package org.seleniumhq.example.model;

import javax.annotation.PostConstruct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractWebPage implements WebPage {
    
    @Autowired 
    protected WebDriver webDriver;
    
    @PostConstruct
    public void initElements() {
    	PageFactory.initElements(webDriver, this);
	}
    
    public void closePage() {
        webDriver.close();
    }

    public void quitBrowser() {
        webDriver.quit();
    }

}
