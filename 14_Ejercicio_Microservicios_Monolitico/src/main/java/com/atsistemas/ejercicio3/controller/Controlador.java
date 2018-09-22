package com.atsistemas.ejercicio3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.atsistemas.ejercicio3.core.dto.PersonaDto;
import com.atsistemas.ejercicio3.core.servicios.Servicio;

@Controller
@RequestMapping(path = "/Persona")
public class Controlador {

	private Servicio servicioPersonas;

	@Autowired
	public Controlador(Servicio servicioPersonas) {
		this.servicioPersonas = servicioPersonas;
	}

	@PostMapping
	public String insertar(
			//@ModelAttribute("persona") PersonaDto persona) {
			@RequestBody MultiValueMap<String, String> formParams) {
			//@RequestParam PersonaDto persona) {
		
		PersonaDto personaDto = new PersonaDto(
											Long.parseLong(formParams.getFirst("persona.id")), 
											formParams.getFirst("persona.nombre"), 
											Integer.parseInt(formParams.getFirst("persona.edad")));
		servicioPersonas.insertar(personaDto);

		return "redirect:Persona?nombre=" + personaDto.getNombre();
	}

	@GetMapping
	public String buscarPorNombre(@RequestParam String nombre, Model model) {
		List<PersonaDto> resultado = servicioPersonas.buscarPorNombre(nombre);

		model.addAttribute("resultado", resultado);
		
		return "persona/detalle";
	}

}
