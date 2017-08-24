package org.seleniumhq.example.conf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.seleniumhq.example.model.Page;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class PageBeanPostProcessor implements BeanPostProcessor {

	@Autowired
	private WebDriver webDriver;

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (bean.getClass().isAnnotationPresent(Page.class)) {
			PageFactory.initElements(webDriver, bean);
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}
	
}
