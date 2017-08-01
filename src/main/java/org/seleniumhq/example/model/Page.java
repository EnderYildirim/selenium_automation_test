package org.seleniumhq.example.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class Page {

    private WebDriver webDriver;

    protected String PAGE_URL;

    public Page(WebDriver webDriver) {
        this.webDriver = webDriver;

        //Initialize Page Elements
        PageFactory.initElements(webDriver, this);
    }

    public void openPage() {
        webDriver.get(PAGE_URL);
    }
    
    public void closePage() {
        webDriver.close();
    }

    public void quitBrowser() {
        webDriver.quit();
    }
    
}
