package com.atsistemas.propiedades;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.atsistemas.propiedades.core.entidades.Persona;
import com.atsistemas.propiedades.core.persistencia.PersonaDao;

public class Aplicacion {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.atsistemas.propiedades");

		PersonaDao personaDao = context.getBean(PersonaDao.class);
		
		
		
	}

}
