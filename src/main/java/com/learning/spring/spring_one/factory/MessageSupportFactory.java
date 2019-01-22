package com.learning.spring.spring_one.factory;

import java.util.Properties;

import com.learning.spring.spring_interface.MessageProvider;
import com.learning.spring.spring_interface.MessageRenderer;

public class MessageSupportFactory {
	
	private static MessageSupportFactory instance;
	private  Properties props;
	private MessageRenderer renderer;
	private MessageProvider provider;
	
	private MessageSupportFactory() {
		
		props = new Properties();
		
		try {
			props.load(this.getClass().getResourceAsStream("/msf.properties"));
			String rendererClass = props.getProperty("renderer.class");
			String providerClass = props.getProperty("provider.class");
			renderer = (MessageRenderer) Class.forName(rendererClass).newInstance();
			provider = (MessageProvider) Class.forName(providerClass).newInstance();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	static {
		instance = new MessageSupportFactory();
	}
	
	public static MessageSupportFactory getInstance() {
		return instance;
	}
	
	public MessageRenderer getMessageRenderer() {
		return renderer;
		
	}
	
	public MessageProvider getMessageProvider() {
		return provider;
	}
}
