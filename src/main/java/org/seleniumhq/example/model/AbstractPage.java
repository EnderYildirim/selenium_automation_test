package org.seleniumhq.example.model;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractPage {

	@Autowired
    private WebDriver webDriver;

    protected String PAGE_URL;

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
