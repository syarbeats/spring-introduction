package com.learning.spring.spring_one;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learning.spring.spring_interface.MessageRenderer;
import com.learning.spring.spring_one.configuration.HelloWorldConfiguration;

public class HelloWorldSpringAnnotated {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
		mr.render();
	}

}
