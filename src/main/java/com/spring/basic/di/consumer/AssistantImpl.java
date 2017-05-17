package com.spring.basic.di.consumer;

import com.spring.basic.di.service.MessageSender;

public class AssistantImpl implements Consumer {
	MessageSender msender;
	
	public AssistantImpl(MessageSender ms) {
		this.msender = ms;
	}
	
	@Override
	public void send(String msg, String addr) {
		msender.sendMessage(msg, addr);
	}

}
