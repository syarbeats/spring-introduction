package com.learning.spring.spring_one;

import com.learning.spring.spring_interface.MessageProvider;
import com.learning.spring.spring_interface.MessageRenderer;

public class HelloWorldDecoupled {
	public static void main(String... args) {
		MessageRenderer mr = new StandardOutMessageRenderer();
		MessageProvider mp =  new HelloWorldMessageProvider();
		mr.setMessageProvider(mp);
		mr.render();
	}
}
