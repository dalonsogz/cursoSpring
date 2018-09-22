package com.atsistemas.ejercicio3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atsistemas.ejercicio3.core.dto.PersonaDto;
import com.atsistemas.ejercicio3.core.servicios.Servicio;

@RestController
@RequestMapping(path = "/Persona")
public class Controlador {

	private Servicio servicioPersonas;

	@Autowired
	public Controlador(Servicio servicioPersonas) {
		this.servicioPersonas = servicioPersonas;
	}

	@PostMapping(consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> insertar(@RequestBody PersonaDto personaDto){
		
		servicioPersonas.insertar(personaDto);
		
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<PersonaDto>> buscarPorNombre(@RequestParam String nombre){
		List<PersonaDto> resultado = servicioPersonas.buscarPorNombre(nombre);
		
		return new ResponseEntity<List<PersonaDto>>(resultado, HttpStatus.OK);
	}

}
