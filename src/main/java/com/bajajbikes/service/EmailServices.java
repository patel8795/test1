package com.bajajbikes.service;

public interface EmailServices {
	
	public void  sentMail(String to,String sub,String body);
	public void sendMailWithAttachment(String tomail, String body,String sub, String attachment);
}
