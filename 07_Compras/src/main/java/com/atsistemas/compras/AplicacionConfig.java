package com.atsistemas.compras;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.atsistemas.compras.servicios.Servicio;

public class AplicacionConfig {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.atsistemas.compras.config");
		
		Servicio servicio = context.getBean(Servicio.class);
		System.out.println("Resultado:" + servicio.consultarTodos());


	}

}
