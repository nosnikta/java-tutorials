package com.nklkarthi.config;

import java.util.HashMap;
import java.util.Map;

import com.nklkarthi.web.controller.handlermapping.SimpleUrlMappingController;
import com.nklkarthi.web.controller.handlermapping.BeanNameHandlerMappingController;
import com.nklkarthi.web.controller.handlermapping.WelcomeController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;


@Configuration
public class HandlerMappingPrioritiesConfig {

    @Bean
    BeanNameUrlHandlerMapping beanNameUrlHandlerMapping() {
        BeanNameUrlHandlerMapping beanNameUrlHandlerMapping = new BeanNameUrlHandlerMapping();
        beanNameUrlHandlerMapping.setOrder(1);
        return beanNameUrlHandlerMapping;
    }

    @Bean
    public SimpleUrlHandlerMapping simpleUrlHandlerMapping() {
        SimpleUrlHandlerMapping simpleUrlHandlerMapping = new SimpleUrlHandlerMapping();
        simpleUrlHandlerMapping.setOrder(0);
        Map<String, Object> urlMap = new HashMap<>();
        urlMap.put("/welcome", simpleUrlMapping());
        simpleUrlHandlerMapping.setUrlMap(urlMap);
        return simpleUrlHandlerMapping;
    }

    @Bean
    public SimpleUrlMappingController simpleUrlMapping() {
        return new SimpleUrlMappingController();
    }

    @Bean("/welcome")
    public BeanNameHandlerMappingController beanNameHandlerMapping() {
        return new BeanNameHandlerMappingController();
    }
}