package com.spring.basic.di.service;

public class SmsMessageSenderImpl implements MessageSender{

	public void sendMessage(String msg, String addr) {
		System.out.println("Message: " + msg + "has been sent to: " + addr);
		
	}

	
}
