package com.atsistemas.applicationcontext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atsistemas.applicationcontext.core.servicios.Servicio;
import com.atsistemas.applicationcontext.presentacion.controladores.Controlador;

public class AplicacionXml {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Controlador controlador = context.getBean(Controlador.class);
		
		controlador.procesarPeticion();
		
		System.out.println(controlador);
		System.out.println(context.getBean(Controlador.class));
		
		System.out.println(context.getBean(Servicio.class));
		System.out.println(context.getBean(Servicio.class));
	}
}
