package com.example.demo.config;

import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * Created by Admin on 22/03/2018.
 */
@Configuration
@Profile("dev")
public class ContextParametersDev implements ServletContextInitializer {
    @Override
    public void onStartup(ServletContext servletContext)
            throws ServletException {

        servletContext.setAttribute("com.ocpsoft.pretty.CONFIG_FILES",new PrettyConfigCustom());
    }
}