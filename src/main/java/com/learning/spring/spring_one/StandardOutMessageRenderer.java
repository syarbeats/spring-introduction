package com.learning.spring.spring_one;

import com.learning.spring.spring_interface.MessageProvider;
import com.learning.spring.spring_interface.MessageRenderer;

public class StandardOutMessageRenderer implements MessageRenderer {

	private MessageProvider messageProvider;
	
	public void render() {
		
		if(messageProvider == null) {
			throw new RuntimeException("You must set the property messageProvider of class:"+StandardOutMessageRenderer.class.getName());
		}
		System.out.println(messageProvider.getMessage());

	}

	public void setMessageProvider(MessageProvider provider) {
		this.messageProvider = provider;

	}

	public MessageProvider getMessageProvider() {
		
		return this.messageProvider;
	}

}
