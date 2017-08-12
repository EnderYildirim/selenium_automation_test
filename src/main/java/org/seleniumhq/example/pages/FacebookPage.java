package org.seleniumhq.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.seleniumhq.example.model.AbstractPage;

public class FacebookPage extends AbstractPage {

    @FindBy(name="email")
    private WebElement userEmailElement;
    
    @FindBy(name="pass")
    private WebElement userPassElement;
    
    @FindBy(xpath="//label[@id='loginbutton']")
    private WebElement loginButton;
    
    @FindBy(linkText="Welcome")
    private WebElement welcomeText;

    public FacebookPage(WebDriver webDriver) {
        super(webDriver);
        PAGE_URL = "https://www.facebook.com";
    }

    public void setUserEmail(String userEmail) {
        userEmailElement.sendKeys(userEmail);
    }
    
    public void setUserPassword(String userPass) {
        userPassElement.sendKeys(userPass);
    }
    
    public void clickLogIn() {
        loginButton.click();
    }
    
    public boolean isLoggedIn() {
        return welcomeText.isEnabled();
    }
}
