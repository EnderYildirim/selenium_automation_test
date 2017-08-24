package org.seleniumhq.example.pages;

import org.junit.Test;
import org.seleniumhq.example.model.SeleniumTestCase;
import org.springframework.beans.factory.annotation.Autowired;

public class FacebookPageTest extends SeleniumTestCase {

    @Autowired
    private FacebookPage facebook;

    @Test
    public void testLogIn() throws Exception {
        facebook.openPage();
        facebook.setUserEmail("qkv47689@tqosi.com").setUserPassword("Ender123").clickLogIn();
    }

    @Test
    public void testLogInFailed() throws Exception {
        facebook.openPage();
        facebook.setUserEmail("qkv47689@tqosi.com").setUserPassword("***wrong password***").clickLogIn();
    }

}
