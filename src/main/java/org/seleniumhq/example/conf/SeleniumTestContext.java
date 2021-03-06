package org.seleniumhq.example.conf;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import io.github.bonigarcia.wdm.ChromeDriverManager;

@Configuration
public class SeleniumTestContext {

    @Bean
    public CustomScopeConfigurer customScopeConfigurer(SeleniumTestScope scope) {
        CustomScopeConfigurer scopeConfigurer = new CustomScopeConfigurer();
        Map<String, Object> scopes = new HashMap<>();
        scopes.put("seleniumtest", scope);
        scopeConfigurer.setScopes(scopes);
        return scopeConfigurer;
    }

    @Bean
    @Scope("seleniumtest")
    public WebDriver webDriver() {
        ChromeDriverManager.getInstance().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return webDriver;
    }
    
}
