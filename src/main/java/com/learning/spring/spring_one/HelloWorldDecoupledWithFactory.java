package com.learning.spring.spring_one;

import com.learning.spring.spring_interface.MessageProvider;
import com.learning.spring.spring_interface.MessageRenderer;
import com.learning.spring.spring_one.factory.MessageSupportFactory;

public class HelloWorldDecoupledWithFactory {

	public static void main(String[] args) {
		
		MessageRenderer mr = MessageSupportFactory.getInstance().getMessageRenderer();
		MessageProvider mp = MessageSupportFactory.getInstance().getMessageProvider();
		mr.setMessageProvider(mp);
		mr.render();

	}

}
