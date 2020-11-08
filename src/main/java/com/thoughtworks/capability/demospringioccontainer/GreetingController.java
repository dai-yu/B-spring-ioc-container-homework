package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.function.Function;


public class GreetingController {

    @Autowired
    private Function<String, GreetingService> beanFactory;

    public GreetingController() {
        System.out.println("Singleton instance created");
    }

    @GetMapping("/greet")
    public String greet() {
        return beanFactory.apply(null).sayHi();
    }

}
