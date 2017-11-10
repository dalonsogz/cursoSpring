package com.atsistemas.persistencia.core.persistencia.data.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.atsistemas.persistencia.core.entidades.Cliente;
import com.atsistemas.persistencia.core.persistencia.ClienteDao;

public interface ClienteJpaDataDao extends ClienteDao, JpaRepository<Cliente, Integer>{

	List<Cliente> findByNombre(String nombre);
	
	@Query("select c from Cliente c where c.direccion = :direccion")
	List<Cliente> busquedaPorDireccion(String direccion);
	
}
