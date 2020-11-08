package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

public class GreetingService {

    GreetingService(){
        System.out.println("Prototype instance created");
    }
    String sayHi() {
        return "hello world";
    }
}
