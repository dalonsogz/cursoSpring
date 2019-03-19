package com.atsistemas.ciclodevida;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AplicacionXml {

//	@Autowired
//	private Persona persona;
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Persona persona = context.getBean(Persona.class);
		
		System.out.println("Antes de esta sentencia se habra ejecutado tanto constructor, como setter como init");
	}

}
