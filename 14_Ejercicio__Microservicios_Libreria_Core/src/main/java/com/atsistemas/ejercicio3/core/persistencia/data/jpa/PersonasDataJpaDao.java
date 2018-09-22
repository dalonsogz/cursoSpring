package com.atsistemas.ejercicio3.core.persistencia.data.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.atsistemas.ejercicio3.core.entidades.Persona;

public interface PersonasDataJpaDao extends JpaRepository<Persona, Long>{
	
	@Query("select p from Persona p where p.name = :nombre")
	List<Persona> busquedaPorNombre(@Param("nombre") String nombre);
	
}
