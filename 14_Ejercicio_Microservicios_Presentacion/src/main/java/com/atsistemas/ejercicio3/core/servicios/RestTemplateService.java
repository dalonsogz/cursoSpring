package com.atsistemas.ejercicio3.core.servicios;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.atsistemas.ejercicio3.cliente.dto.PersonaDto;

@Service
public class RestTemplateService implements Servicio {

	private RestTemplate restTemplate;
	
	
	@Autowired
	public RestTemplateService(RestTemplate restTemplate) {
		super();
		this.restTemplate = restTemplate;
	}
	
	@Override
	public void insertar(PersonaDto personaDto) {
		try {
			restTemplate.postForEntity(new URI("http://localhost:8082/Persona"), personaDto, Void.class);
		} catch (Exception e) {
			throw new RuntimeException();
		}

	}

	@Override
	public List<PersonaDto> buscarPorNombre(String nombre) {
		ResponseEntity<List> resultadoE = restTemplate.getForEntity("http://localhost:8082/Persona?nombre={nombre}", List.class, nombre); 
		
		List<PersonaDto> resultado = null;

		return resultado;
		
	}

}
