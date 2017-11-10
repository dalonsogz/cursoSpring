package com.atsistemas.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.atsistemas.web.services.Servicio;

@Configuration
public class ConfiguracionSpringWeb {

	@Bean
	public Servicio servicio() {
		return new Servicio();
	}
	
}
