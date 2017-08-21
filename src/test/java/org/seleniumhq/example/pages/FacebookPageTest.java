package org.seleniumhq.example.pages;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacebookPageTest {

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
		facebook.setUserEmail("qkv47689@tqosi.com").setUserPassword("Endeasdasdr123").clickLogIn();
	}

}
