package com.learning.spring.spring_one.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learning.spring.spring_interface.MessageProvider;
import com.learning.spring.spring_interface.MessageRenderer;
import com.learning.spring.spring_one.HelloWorldMessageProvider;
import com.learning.spring.spring_one.StandardOutMessageRenderer;

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public MessageProvider provider() {
		return new HelloWorldMessageProvider();
	}
	
	@Bean
	public MessageRenderer renderer() {
		MessageRenderer renderer = new StandardOutMessageRenderer();
		renderer.setMessageProvider(provider());
		return renderer;
	}
}
