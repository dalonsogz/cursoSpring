package com.atsistemas.persistencia.core.persistencia.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.atsistemas.persistencia.core.entidades.Cliente;

public class ClienteRowMapper implements RowMapper<Cliente> {

	@Override
	public Cliente mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Cliente(rs.getInt("id"), rs.getString("nombre"), rs.getString("direccion"),
				rs.getString("telefono"));
	}

}
