package com.atsistemas.compras.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.atsistemas.compras.entidades.Compra;
import com.atsistemas.compras.persistencia.data.jpa.CompraJpaDataRepository;

@Service
@Transactional
public class ServicioImpl implements Servicio {

	@Autowired
	private CompraJpaDataRepository compraJpaDataRepository;

	public List<Compra> consultarTodos(){
		return compraJpaDataRepository.findAll();
	}
	
}
