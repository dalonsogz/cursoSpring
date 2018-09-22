package com.atsistemas.ejercicio3.core.servicios;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atsistemas.ejercicio3.core.dto.PersonaDto;
import com.atsistemas.ejercicio3.core.entidades.Persona;
import com.atsistemas.ejercicio3.core.negocio.ConversionesDtoEntidad;
import com.atsistemas.ejercicio3.core.persistencia.data.jpa.PersonasDataJpaDao;

@Service
@Transactional
public class ServicioPersonas implements Servicio{

	private PersonasDataJpaDao personasDao;

	private ConversionesDtoEntidad conversionDtoEntidad;
	
	@Autowired
	public ServicioPersonas(PersonasDataJpaDao personasDao, ConversionesDtoEntidad conversionDtoEntidad) {
		super();
		this.personasDao = personasDao;
		this.conversionDtoEntidad = conversionDtoEntidad;
	}

	public void insertar(PersonaDto personaDto) {
		Persona p = conversionDtoEntidad.convertirPersonaDtoEntidad(personaDto);

		personasDao.save(p);
	}

	public List<PersonaDto> buscarPorNombre(String nombre) {
		List<Persona> personas = personasDao.busquedaPorNombre(nombre);
		List<PersonaDto> result = new ArrayList<PersonaDto>();
		for (Persona p : personas) {
			result.add(conversionDtoEntidad.convertirPersonaEntidadDto(p));
		}
		return result;
	}

}
