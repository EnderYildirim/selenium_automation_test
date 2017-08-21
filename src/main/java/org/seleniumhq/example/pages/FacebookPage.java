package org.seleniumhq.example.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.seleniumhq.example.model.AbstractPage;
import org.seleniumhq.example.model.Page;

@Page
public class FacebookPage extends AbstractPage {

    @FindBy(name="email")
    private WebElement userEmailElement;
    
    @FindBy(name="pass")
    private WebElement userPassElement;
    
    @FindBy(xpath="//label[@id='loginbutton']")
    private WebElement loginButton;
    
    @FindBy(linkText="Welcome")
    private WebElement welcomeText;

    public FacebookPage() {
        PAGE_URL = "https://www.facebook.com";
    }

    public FacebookPage setUserEmail(String userEmail) {
    	userEmailElement.clear();
        userEmailElement.sendKeys(userEmail);
        return this;
    }
    
    public FacebookPage setUserPassword(String userPass) {
    	userPassElement.clear();
        userPassElement.sendKeys(userPass);
        return this;
    }
    
    public FacebookPage clickLogIn() {
        loginButton.click();
        return this;
    }
    
    public FacebookPage isLoggedIn() {
        Assert.assertTrue(welcomeText.isEnabled());
        return this;
    }
}
