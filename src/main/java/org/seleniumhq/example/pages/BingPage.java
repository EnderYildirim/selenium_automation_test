package org.seleniumhq.example.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.seleniumhq.example.model.AbstractWebPage;
import org.seleniumhq.example.model.Page;

@Page
public class BingPage extends AbstractWebPage {

    @FindBy(name = "q")
    private WebElement searchBox;

    @FindBy(linkText = "www.seleniumhq.org")
    private WebElement seleniumURL;

    public BingPage setSearchText(String text) {
        searchBox.clear();
        searchBox.sendKeys(text);
        return this;
    }

    public BingPage submitSearch() {
        searchBox.submit();
        return this;
    }

    public BingPage validateSearch() {
        Assert.assertTrue(seleniumURL != null);
        return this;
    }

    @Override
    public BingPage openPage() {
        webDriver.get("https://www.bing.com");
        return this;
    }
}
