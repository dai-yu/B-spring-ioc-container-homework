package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoSpringIocContainerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoSpringIocContainerApplication.class, args);

		GreetingController greetingController1 = context.getBean(GreetingController.class);
		greetingController1.greet();

		GreetingController greetingController2 = context.getBean(GreetingController.class);
		greetingController2.greet();
	}

}
