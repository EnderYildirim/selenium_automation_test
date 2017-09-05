package org.seleniumhq.example.pages;

import org.junit.Test;
import org.seleniumhq.example.conf.SeleniumTestCase;
import org.springframework.beans.factory.annotation.Autowired;

public class BingPageTest extends SeleniumTestCase {
    
    @Autowired
    private BingPage bing;

    @Test
    public void testBingSeach() throws Exception {
        bing.openPage()
            .setSearchText("selenium test")
            .submitSearch()
            .validateSearch();
    }
    
}
