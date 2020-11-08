package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.function.Function;

@Configuration
public class TestConfiguration {

    @Bean
    public Function<String, GreetingService> beanFactory() {
        return t -> GreetingService();
    }

    @Bean
    @Scope(value = "prototype")
    public GreetingService GreetingService() {
        return new GreetingService();
    }

    @Bean
    public GreetingController GreetingController() {
        return new GreetingController();
    }
}
