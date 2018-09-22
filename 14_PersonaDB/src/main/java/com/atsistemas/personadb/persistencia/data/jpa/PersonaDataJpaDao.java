package com.atsistemas.personadb.persistencia.data.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.atsistemas.personadb.entidades.Persona;


public interface PersonaDataJpaDao extends JpaRepository<Persona, Long> {

	@Query("select p from Persona p where p.nombre = :nombre")
	List<Persona> findByNombre(@Param("nombre") String nombre);

}
