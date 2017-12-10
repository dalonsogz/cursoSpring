package com.atsistemas.mezcladecontextos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.atsistemas.mezcladecontextos.core.servicios.Servicio;
import com.atsistemas.mezcladecontextos.presentacion.controladores.Controlador;

@Configuration
@ImportResource("classpath:ApplicationContext.xml")
public class Configuracion {

	@Autowired
	private Servicio servicio;
	
	@Bean
	public Controlador controlador() {
		return new Controlador(this.servicio);
	}
	
	
}
