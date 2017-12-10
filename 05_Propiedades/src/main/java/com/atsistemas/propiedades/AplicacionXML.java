package com.atsistemas.propiedades;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atsistemas.propiedades.core.entidades.Persona;
import com.atsistemas.propiedades.core.persistencia.PersonaDao;

public class AplicacionXML {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		PersonaDao personaDao = context.getBean(PersonaDao.class);
		
		
		
	}

}
