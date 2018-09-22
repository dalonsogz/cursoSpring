package com.atsistemas.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;

import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.atsistemas.rest.core.dto.PersonaDto;

public class AplicacionCliente {
	public static void main(String[] args) throws RestClientException, URISyntaxException {

		RestTemplate restTemplate = new RestTemplate(
				Arrays.asList(
						new HttpMessageConverter[] {
								new MappingJackson2HttpMessageConverter()
						}
				)
		);
		
		ResponseEntity<Void> entity = restTemplate.postForEntity(
										new URI("http://localhost:8080/Persona"), 
										new PersonaDto("Juan", 30), 
										Void.class);
		
		System.out.println(entity.getStatusCode());
		System.out.println(entity.getHeaders().getLocation());
		
		
	}
}
