package com.atsistemas.ejercicio3.core.servicios;

import java.util.List;

import com.atsistemas.ejercicio3.core.dto.PersonaDto;

public interface Servicio {

	void insertar(PersonaDto personaDto);

	List<PersonaDto> buscarPorNombre(String nombre);

}