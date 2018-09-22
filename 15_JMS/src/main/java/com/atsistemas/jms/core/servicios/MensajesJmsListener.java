package com.atsistemas.jms.core.servicios;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MensajesJmsListener {
	
	@JmsListener(destination="mensajes") //, containerFactory = "myFactory")	
	public void procesarMensaje(String mensaje) {
		System.out.println("Procesando el mensaje:" + mensaje);
	}

}
