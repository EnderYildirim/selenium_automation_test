package org.seleniumhq.example.model;

import org.openqa.selenium.WebDriver;
import org.springframework.test.context.TestContext;
import org.springframework.test.context.support.AbstractTestExecutionListener;

public class SeleniumTestExecutionListener extends AbstractTestExecutionListener {

	@Override
	public void beforeTestClass(TestContext testContext) throws Exception {
	    testContext.getApplicationContext().getBean(SeleniumTestScope.class).reset();
	}

	@Override
	public void afterTestClass(TestContext testContext) throws Exception {
		testContext.getApplicationContext().getBean(WebDriver.class).quit();
	}
	
}