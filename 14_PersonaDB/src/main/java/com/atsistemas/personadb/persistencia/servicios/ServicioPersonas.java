package com.atsistemas.personadb.persistencia.servicios;

import java.util.List;

import com.atsistemas.personadb.entidades.Persona;

public interface ServicioPersonas {

	List<Persona> findByNombre(String nombre);

	void insertar(Persona persona);

}