package com.atsistemas.ejercicio3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Ejercicio4Application extends SpringBootServletInitializer {

	//Necesario para poder emplear esta aplicacion con packaging de War
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Ejercicio4Application.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Ejercicio4Application.class, args);
	}
}
