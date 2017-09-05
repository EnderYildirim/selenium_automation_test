package org.seleniumhq.example.pages;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ BingPageTest.class, GooglePageTest.class })
public class AllTests {

}
