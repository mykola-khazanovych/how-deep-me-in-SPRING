package com.spring.springdi.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.springdi.service.EmailServiceImpl;
import com.spring.springdi.service.MessageService;

@Configuration
@ComponentScan(value= {"com.spring.springdi.consumer"})
public class DIconfiguration {

	@Bean
	public MessageService getMessageService() {
		return new EmailServiceImpl();
	}
}
