package com.rafael.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.rafael.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmaill(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}


