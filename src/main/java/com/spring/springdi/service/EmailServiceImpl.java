package com.spring.springdi.service;

public class EmailServiceImpl implements MessageService {

	public boolean send(String msg, String addr) {

		System.out.println("The e-mail message: \"" + msg + "\" has been sent to: " + addr);
		return true;
	}

}
