package com.atsistemas.ejercicio3.core.negocio;

import org.springframework.stereotype.Component;

import com.atsistemas.ejercicio3.core.dto.PersonaDto;
import com.atsistemas.ejercicio3.core.entidades.Persona;

@Component
public class ConversionesDtoEntidad {
	public Persona convertirPersonaDtoEntidad(PersonaDto personaDto) {
		return new Persona(personaDto.getId(), personaDto.getNombre(), personaDto.getEdad());
	}
	
	public PersonaDto convertirPersonaEntidadDto(Persona p) {
		return new PersonaDto(p.getId(), p.getName(), p.getAge());
	}
}