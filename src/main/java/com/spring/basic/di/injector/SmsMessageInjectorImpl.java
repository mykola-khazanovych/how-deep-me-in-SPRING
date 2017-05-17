package com.spring.basic.di.injector;

import com.spring.basic.di.consumer.AssistantImpl;
import com.spring.basic.di.consumer.Consumer;
import com.spring.basic.di.service.SmsMessageSenderImpl;

public class SmsMessageInjectorImpl implements MessageInjector {

	@Override
	public Consumer getConsumer() {
		
		return new AssistantImpl(new SmsMessageSenderImpl());
	}

}