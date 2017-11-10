package com.atsistemas.eventos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class LanzadorEventos {

	@Autowired
	private ApplicationEventPublisher aep;
	
	public void lanzar() {
		MiEvento miEvento = new MiEvento(this);
		
		//Lanzar el evento
		aep.publishEvent(miEvento);
	}
	
}
