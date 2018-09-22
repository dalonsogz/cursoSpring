package com.atsistemas.webboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class WebBootApplication extends SpringBootServletInitializer {

	//Necesario para poder emplear esta aplicacion con packaging de War
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(WebBootApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(WebBootApplication.class, args);
	}
}
