package com.bajajbikes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.bajajbikes.Utility.EmailSender;
import com.bajajbikes.service.EmailServices;

@SpringBootApplication
public class BajajbikesApplication {
	
	@Autowired
	private EmailSender service;

	public static void main(String[] args) {SpringApplication.run(BajajbikesApplication.class, args);
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail() {
		//service.sentMail("skpshravan787@gmail.com", "this is the email send", "java developer");
		//service.sendMailWithAttachment("skpshravan787@gmail.com", "this is the email send", "java developer", 
		//													"C:\\Users\\SKP\\Downloads\\link shravan1");
	}
}
