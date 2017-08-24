package org.seleniumhq.example.conf;

import org.openqa.selenium.WebDriver;
import org.springframework.test.context.TestContext;
import org.springframework.test.context.support.AbstractTestExecutionListener;

public class SeleniumTestExecutionListener extends AbstractTestExecutionListener {

	@Override
	public void afterTestClass(TestContext testContext) throws Exception {
		testContext.getApplicationContext().getBean(WebDriver.class).quit();
		testContext.getApplicationContext().getBean(SeleniumTestScope.class).reset();
	}
	
}