package com.atsistemas.propiedades.core.persistencia;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.atsistemas.propiedades.core.entidades.Persona;

@Repository
public class PersonaDao {

	private DataSource ds;
	
	@Autowired	
	public PersonaDao(DataSource ds) {
		super();
		this.ds = ds;
	}

	public void insertar(Persona persona) throws SQLException {
		try(Connection connection = ds.getConnection()){
			//JDBC
		}
	}
}
