package com.atsistemas.persistencia.core.persistencia.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.atsistemas.persistencia.core.entidades.Cliente;
import com.atsistemas.persistencia.core.persistencia.ClienteDao;

@Repository
public class ClienteJdbcDao extends JdbcDaoSupport implements ClienteDao{

	@Autowired
	public ClienteJdbcDao(JdbcTemplate template) {
		super();
		setJdbcTemplate(template);
	}

	/* (non-Javadoc)
	 * @see com.atsistemas.persistencia.ClienteDao#consultarTodos()
	 */
	@Override
	public List<Cliente> findAll(){		
		return getJdbcTemplate().query("SELECT * FROM CLIENTES", new ClienteRowMapper());
	}
	
	/* (non-Javadoc)
	 * @see com.atsistemas.persistencia.ClienteDao#consultarPorId(int)
	 */
	@Override
	public Cliente getOne(Integer id){		
		return getJdbcTemplate().queryForObject(
				"SELECT * FROM CLIENTES WHERE id = ?", 
				new Object[] {id}, 
				new ClienteRowMapper());
	}

	@Override
	public List<Cliente> findByNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
