package com.atsistemas.persistencia.core.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atsistemas.persistencia.core.entidades.Cliente;
import com.atsistemas.persistencia.core.persistencia.ClienteDao;

@Service
public class Servicio {

	private ClienteDao clienteDao;

	@Autowired
	public Servicio(ClienteDao clienteDao) {
		super();
		this.clienteDao = clienteDao;
	}
	
	public List<Cliente> consultarTodos(){
		return clienteDao.findAll();
	}
	
}
