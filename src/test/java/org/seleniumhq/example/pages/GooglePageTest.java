package org.seleniumhq.example.pages;

import org.junit.Test;
import org.seleniumhq.example.conf.SeleniumTestCase;
import org.springframework.beans.factory.annotation.Autowired;

public class GooglePageTest extends SeleniumTestCase {
    
    @Autowired
    private GooglePage google;

    @Test
    public void testGoogleSeach() throws Exception {
        google.openPage()
              .setSearchText("selenium test")
              .submitSearch()
              .validateSearch();
    }
    
}
