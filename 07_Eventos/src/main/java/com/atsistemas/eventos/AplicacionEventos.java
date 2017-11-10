package com.atsistemas.eventos;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AplicacionEventos {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext("com.atsistemas.eventos");

		context.publishEvent(new MiEvento("Desde la aplicacion"));
		
		LanzadorEventos lanzadorEventos = context.getBean(LanzadorEventos.class);
		
		lanzadorEventos.lanzar();
		
	}
}
