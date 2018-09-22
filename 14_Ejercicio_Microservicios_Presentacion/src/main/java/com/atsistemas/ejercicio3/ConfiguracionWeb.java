package com.atsistemas.ejercicio3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfiguracionWeb {

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
}
