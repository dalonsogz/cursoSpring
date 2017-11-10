package com.atsistemas.persistencia;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.atsistemas.persistencia.core.servicios.Servicio;

public class AplicacionPersistencia {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.atsistemas.persistencia.config");
		
		Servicio servicio = context.getBean(Servicio.class);
		System.out.println(servicio.consultarTodos());


	}

}
