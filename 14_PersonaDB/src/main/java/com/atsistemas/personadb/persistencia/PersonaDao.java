package com.atsistemas.personadb.persistencia;

import java.util.List;

import com.atsistemas.personadb.entidades.Persona;

public interface PersonaDao {

	
	List<Persona> findByNombre(String nombre);

}