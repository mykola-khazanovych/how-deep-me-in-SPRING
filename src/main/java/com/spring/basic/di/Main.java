package com.spring.basic.di;

import com.spring.basic.di.injector.EmailMessageInjectorImpl;
import com.spring.basic.di.injector.MessageInjector;
import com.spring.basic.di.injector.SmsMessageInjectorImpl;
import com.spring.basic.di.consumer.*;

public class Main {
	public static void main(String... args) {
		
		MessageInjector injector = null;
		Consumer consumer = null;
		String message = "Test message!";
		String emailAddress = "mail@mail.com";
		String phoneNumber = "1234567890";
		
		//send SMS
		injector = new SmsMessageInjectorImpl();
		consumer = injector.getConsumer();
		consumer.send(message, phoneNumber);
		
		//send Email
		injector = new EmailMessageInjectorImpl();
		consumer = injector.getConsumer();
		consumer.send(message, emailAddress);
		
	}
}
