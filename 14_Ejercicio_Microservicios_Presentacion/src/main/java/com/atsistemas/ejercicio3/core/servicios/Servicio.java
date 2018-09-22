package com.atsistemas.ejercicio3.core.servicios;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.atsistemas.ejercicio3.cliente.dto.PersonaDto;

@FeignClient(name="core")
public interface Servicio {

	@PostMapping(path="/Persona",consumes=MediaType.APPLICATION_JSON_VALUE)
	void insertar(PersonaDto personaDto);

	@GetMapping(path="/Persona",consumes=MediaType.APPLICATION_JSON_VALUE)
	List<PersonaDto> buscarPorNombre(String nombre);

	

}