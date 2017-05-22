package com.spring.springdi.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.springdi.service.MessageService;

@Component
public class Assistant {

	private MessageService service;
	
//	constructor-based dependency injection	
/**	@Autowired
    public MessageSender(MessageService service) {
		this.service = service;
	}
	
	public boolean sendMessage(String msg, String addr) {
		
		return this.service.send(msg, addr);
	}
*/
	
	@Autowired
	public void setService(MessageService service) {
		this.service = service;
	}
	
	public boolean sendMessage(String msg, String addr) {
		
		return this.service.send(msg, addr);
	}
	
}
