package com.learning.spring.spring_one;

import com.learning.spring.spring_interface.MessageProvider;

public class HelloWorldMessageProvider implements MessageProvider
{

	public String getMessage() {
		// TODO Auto-generated method stub
		return "Hello World - Jave Decoupled!";
	}
    
}
