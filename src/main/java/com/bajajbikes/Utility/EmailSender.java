package com.bajajbikes.Utility;


import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import com.bajajbikes.service.EmailServices;

@Component
public class EmailSender implements EmailServices {

	@Autowired
	private JavaMailSender javamailSender;

	@Override
	public void sentMail(String to, String sub, String body) {
	
	
		try {
			
			SimpleMailMessage mmh = new SimpleMailMessage();
			mmh.setTo(to);
			mmh.setSubject(sub);
			mmh.setText(body);
			
			javamailSender.send(mmh);
			System.out.println("mail send....");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void sendMailWithAttachment(String tomail, String body,String sub, String attachment) {
		
		MimeMessage mimeMessage = javamailSender.createMimeMessage();
		
		MimeMessageHelper mmHelper;
		try {
			mmHelper = new MimeMessageHelper(mimeMessage, true);
			mmHelper.setTo(tomail);
			mmHelper.setText(body);
			mmHelper.setSubject(sub);
			
			FileSystemResource fileSystem = new FileSystemResource(attachment);
			mmHelper.addAttachment(fileSystem.getFilename(), fileSystem);
			
			javamailSender.send(mimeMessage);
			System.out.println("again send");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}
}
