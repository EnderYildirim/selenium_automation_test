package org.seleniumhq.example.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.seleniumhq.example.model.AbstractWebPage;
import org.seleniumhq.example.model.Page;

@Page
public class GooglePage extends AbstractWebPage {

    @FindBy(name = "q")
    private WebElement searchBox;
    
    @FindBy(linkText = "www.seleniumhq.org")
    private WebElement seleniumURL;
    
    public GooglePage setSearchText(String text) {
        searchBox.clear();
        searchBox.sendKeys(text);
        return this;
    }
    
    public GooglePage submitSearch() {
        searchBox.submit();
        return this;
    }
    
    public GooglePage validateSearch() {
        Assert.assertTrue(seleniumURL != null);
        return this;
    }

    @Override
    public GooglePage openPage() {
        webDriver.get("https://www.google.com");
        return this;
    }
    
}
