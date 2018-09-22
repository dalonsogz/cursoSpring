package com.atsistemas.ejercicio3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class Ejercicio3Application extends SpringBootServletInitializer {

	//Necesario para poder emplear esta aplicacion con packaging de War
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Ejercicio3Application.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Ejercicio3Application.class, args);
	}
}
