package com.atsistemas.personadb.persistencia.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.atsistemas.personadb.entidades.Persona;
import com.atsistemas.personadb.persistencia.PersonaDao;
import com.atsistemas.personadb.persistencia.data.jpa.PersonaDataJpaDao;

@Service
@Transactional
public class ServicioPersonasImpl implements ServicioPersonas {

	private PersonaDataJpaDao personaDao;

	@Autowired
	public ServicioPersonasImpl(PersonaDataJpaDao personaDao) {
		super();
		this.personaDao = personaDao;
	}
	
	/* (non-Javadoc)
	 * @see com.atsistemas.personadb.persistencia.servicios.ServicioPersonas#findByNombre(java.lang.String)
	 */
	@Override
	public List<Persona> findByNombre(String nombre){
		return personaDao.findByNombre(nombre);
	}
	
	/* (non-Javadoc)
	 * @see com.atsistemas.personadb.persistencia.servicios.ServicioPersonas#insertar(com.atsistemas.personadb.entidades.Persona)
	 */
	@Override
	public void insertar(Persona persona) {
		personaDao.save(persona);
	}
}
