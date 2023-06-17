package com.example.springtest.configuration;

import org.glassfish.jersey.servlet.ServletContainer;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import jakarta.servlet.Servlet;

@Configuration
@Primary
public class DefaultJerseyServletConfig {
    @Bean
    public ServletRegistrationBean defaultJersey(RestResourceMainConfig serviceConfig){
        ServletRegistrationBean defaultJersey = new ServletRegistrationBean<Servlet>(new ServletContainer(serviceConfig));
        defaultJersey.addUrlMappings("/backend/api/*");
        defaultJersey.setName("DefaultJersey");
        defaultJersey.setLoadOnStartup(0);
        return defaultJersey;
    }
}
