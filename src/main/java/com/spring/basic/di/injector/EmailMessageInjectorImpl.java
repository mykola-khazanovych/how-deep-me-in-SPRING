package com.spring.basic.di.injector;

import com.spring.basic.di.consumer.AssistantImpl;
import com.spring.basic.di.consumer.Consumer;
import com.spring.basic.di.service.EmailMessageSenderImpl;

public class EmailMessageInjectorImpl implements MessageInjector {

	public Consumer getConsumer() {
		
		return new AssistantImpl(new EmailMessageSenderImpl());
	}

}
