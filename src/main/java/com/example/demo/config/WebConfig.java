package com.example.demo.config;

import org.ocpsoft.rewrite.servlet.RewriteFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.DispatcherType;

/**
 * Created by Admin on 22/03/2018.
 */

@Configuration
public class WebConfig {

    @Bean
    public FilterRegistrationBean prettyFilter() {
        FilterRegistrationBean registration  = new FilterRegistrationBean(new RewriteFilter());
        registration .setDispatcherTypes(DispatcherType.FORWARD, DispatcherType.REQUEST, DispatcherType.ASYNC,
                DispatcherType.ERROR);
        registration .addUrlPatterns("/*");
        return registration ;
    }
}
