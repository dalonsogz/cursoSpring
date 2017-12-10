package com.atsistemas.mezcladecontextos;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.atsistemas.mezcladecontextos.presentacion.controladores.Controlador;

public class AplicacionJavaConfig {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.atsistemas.mezcladecontextos");

		Controlador controlador = context.getBean(Controlador.class);

		controlador.procesarPeticion();
	}

}
