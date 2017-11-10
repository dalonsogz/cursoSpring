package com.atsistemas;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Aplicacion {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Negocio negocio = context.getBean(Negocio.class);
		
		System.out.println(negocio.metodo("Victor"));

	}

}
