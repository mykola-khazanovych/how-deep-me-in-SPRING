package com.spring.springdi;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.springdi.configuration.DIconfiguration;
import com.spring.springdi.consumer.Assistant;

public class Main {

	public static void main(String... arg) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIconfiguration.class); 
		Assistant ms = context.getBean(Assistant.class);
		ms.sendMessage("The Spring DI is works!", "mail@mail.com");
		context.close();
	}

}
