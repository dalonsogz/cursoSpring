package com.atsistemas.jms.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmisorJmsController {
	
	@Autowired
	private JmsTemplate jmsTemplate;

	@RequestMapping(path="/Enviar")
	public String enviarMensaje(@RequestParam String mensaje) {
		
		jmsTemplate.convertAndSend("mensajes", mensaje);
		
		return "mensaje enviado:" + mensaje;
	}

}
