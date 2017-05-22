package com.spring.springdi.service;

public class SmsMessage implements MessageService {

	public boolean send(String msg, String addr) {

		System.out.println("The sms-message: \"" + msg + "\" has been sent to: " + addr);
		return true;
	}

}
