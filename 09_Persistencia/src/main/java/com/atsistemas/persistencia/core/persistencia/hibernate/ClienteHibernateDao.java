package com.atsistemas.persistencia.core.persistencia.hibernate;

import java.util.List;

import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.atsistemas.persistencia.core.entidades.Cliente;
import com.atsistemas.persistencia.core.persistencia.ClienteDao;

@Repository
public class ClienteHibernateDao extends HibernateDaoSupport implements ClienteDao {

	@Override
	public List<Cliente> findAll() {
		//HQL
		//List<?> find = getHibernateTemplate().find("select c from Cliente c");
		List<Cliente> list = getSessionFactory().getCurrentSession()
				.createQuery("select c from Cliente c", Cliente.class).list();
		return list;
	}

	@Override
	public Cliente getOne(Integer id) {
		//HQL
		//Cliente cliente = getHibernateTemplate().get(Cliente.class, id);
		Query<Cliente> query = getSessionFactory().getCurrentSession()
				.createQuery("select c from Cliente c where c.id = :id", Cliente.class);
		query.setParameter("id", id);
		Cliente cliente = query.getSingleResult();
		return cliente;
	}

	@Override
	public List<Cliente> findByNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

}
