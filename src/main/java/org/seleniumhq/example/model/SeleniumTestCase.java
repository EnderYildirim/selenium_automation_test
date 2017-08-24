package org.seleniumhq.example.model;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;


@RunWith(SpringRunner.class)
@TestExecutionListeners({ SeleniumTestExecutionListener.class,
    DependencyInjectionTestExecutionListener.class })
@SpringBootTest
public abstract class SeleniumTestCase {

}
