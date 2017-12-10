package com.atsistemas.eventos;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MiListenerDeMiEventoSMS implements ApplicationListener<MiEvento>{

	@Override
	public void onApplicationEvent(MiEvento event) {
		System.out.println("procesado el evento para enviar un SMS: " + event.getSource());
		
	}

}
