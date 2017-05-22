package com.spring.basic.di.service;

public class EmailMessageSenderImpl implements MessageSender {

	public void sendMessage(String msg, String addr) {
		System.out.println("Email: " + msg + " has been sent to: " + addr);
	}

}
