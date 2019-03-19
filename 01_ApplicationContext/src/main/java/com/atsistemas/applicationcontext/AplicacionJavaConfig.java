package com.atsistemas.applicationcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.atsistemas.applicationcontext.core.entidades.Dios;
import com.atsistemas.applicationcontext.core.servicios.Servicio;
import com.atsistemas.applicationcontext.core.servicios.ServicioBasico;
import com.atsistemas.applicationcontext.presentacion.controladores.Controlador;

public class AplicacionJavaConfig {

	public static void main(String[] args) {
		//AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configuracion.class);
		ApplicationContext context = new AnnotationConfigApplicationContext("com.atsistemas.applicationcontext");

		Controlador controlador = context.getBean(Controlador.class);

		controlador.procesarPeticion();

		System.out.println(controlador);
		System.out.println(context.getBean(Controlador.class));

		System.out.println(context.getBean(Servicio.class));
		System.out.println(context.getBean(Servicio.class));

		System.out.println(new ServicioBasico());
		
		Dios miDios = context.getBean(Dios.class);
		System.out.println("miDios:" + miDios.getTipo());
		
	}

}
