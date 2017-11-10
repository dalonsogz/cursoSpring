package com.atsistemas.persistencia.core.persistencia;

import java.util.List;

import com.atsistemas.persistencia.core.entidades.Cliente;

public interface ClienteDao {

	List<Cliente> findAll();

	Cliente getOne(Integer id);
	
	List<Cliente> findByNombre(String nombre);

}