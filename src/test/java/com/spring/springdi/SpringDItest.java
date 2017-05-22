package com.spring.springdi;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.springdi.consumer.Assistant;
import com.spring.springdi.service.MessageService;

@Configuration
@ComponentScan(value="com.journaldev.spring.di.consumer")
public class SpringDItest {
	
	private AnnotationConfigApplicationContext context = null;

	@Bean
	public MessageService getMessageService() {
		return new MessageService(){

			public boolean send(String msg, String rec) {
				System.out.println("Mock Service");
				return true;
			}
			
		};
	}

	@Before
	public void setUp() throws Exception {
		context = new AnnotationConfigApplicationContext(SpringDItest.class);
	}
	
	@After
	public void tearDown() throws Exception {
		context.close();
	}

	@Test
	public void test() {
		Assistant app = context.getBean(Assistant.class);
		Assert.assertTrue(app.sendMessage("Hi Pankaj", "pankaj@abc.com"));
	}

}
