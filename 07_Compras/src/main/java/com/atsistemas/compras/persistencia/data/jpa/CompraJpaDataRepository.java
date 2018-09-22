package com.atsistemas.compras.persistencia.data.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.atsistemas.compras.entidades.Compra;

@Repository
public interface CompraJpaDataRepository extends JpaRepository<Compra, Integer>{

	List<Compra> findByDireccionEntrega(String direccion);
	
	@Query("select c from Compra c where c.direccionEntrega = :direccion")
	List<Compra> busquedaPorDireccion(String direccion);
	
}
