package com.atsistemas.rest.controllers;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atsistemas.rest.core.dto.PersonaDto;

@RestController
@RequestMapping(path="/Persona")
public class Controlador {

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> alta(@RequestBody PersonaDto persona) throws URISyntaxException {
		
		HttpHeaders headers = new HttpHeaders();
		
		headers.setLocation(new URI("http://localhost:8080/Persona/7"));
		
		return new ResponseEntity<>(headers, HttpStatus.CREATED);
	}

	@RequestMapping(method = RequestMethod.DELETE)
	public ResponseEntity<Void> baja() {
		return null;
	}

	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<Void> modificacion() {
		return null;
	}
	
	// http://localhost:8080/Persona/7
	@RequestMapping(path="/{pk}", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<PersonaDto> consulta(@PathVariable Long pk) {
		return null;
	}
	
	@RequestMapping(method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<PersonaDto>> consulta(@RequestParam(required=false) String nombre) {
		return null;
	}
	
	// http://localhost:8080/Persona/7/Pareja
	@RequestMapping(path="/{pk}/Pareja", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<PersonaDto> consultaPorPareja(@PathVariable Long pk) {
		return null;
	}
}
