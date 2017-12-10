package com.atsistemas.applicationcontext.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.atsistemas.applicationcontext.core.entidades.Dios;
import com.atsistemas.applicationcontext.core.servicios.Servicio;
import com.atsistemas.applicationcontext.core.servicios.ServicioBasico;
import com.atsistemas.applicationcontext.presentacion.controladores.Controlador;

@Configuration
public class Configuracion {

	@Bean
	@Scope("prototype")
	@Autowired
	public Controlador miControlador(@Qualifier("miServicio") Servicio servicio) {
		return new Controlador(servicio);
		//return new Controlador(miServicio());
	}
	
	@Bean
	//@Scope("singleton")
	public Servicio miServicio() {
		return new ServicioBasico();
	}
	
	@Bean
	public Dios miDios() {
		return Dios.getInstance();
	}
	
	@Bean
	public String miAdan() {
		return miDios().crearHombres();
	}
	
}
