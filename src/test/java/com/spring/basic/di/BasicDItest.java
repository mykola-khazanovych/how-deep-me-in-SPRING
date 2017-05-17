package com.spring.basic.di;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.spring.basic.di.consumer.AssistantImpl;
import com.spring.basic.di.consumer.Consumer;
import com.spring.basic.di.injector.MessageInjector;
import com.spring.basic.di.service.MessageSender;

public class BasicDItest {

	private MessageInjector injector;
	
	@Before
	public void setUp(){
		//mock the injector with anonymous class
		injector = new MessageInjector() {
			
			@Override
			public Consumer getConsumer() {
				//mock the message service
				return new AssistantImpl(new MessageSender() {
					
					@Override
					public void sendMessage(String msg, String rec) {
						System.out.println("Mock Message Service implementation");
						
					}
				});
			}
		};
	}
	
	@Test
	public void test() {
		Consumer consumer = injector.getConsumer();
		consumer.send("Hi Pankaj", "pankaj@abc.com");
	}
	
	@After
	public void tear(){
		injector = null;
	}

}