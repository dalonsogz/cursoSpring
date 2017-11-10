package com.atsistemas.factoria;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atsistemas.factoria.core.entidades.Coche;
import com.atsistemas.factoria.core.entidades.Factoria;
import com.atsistemas.factoria.core.entidades.Ferrari;
import com.atsistemas.factoria.core.entidades.Fiat;
import com.atsistemas.factoria.core.entidades.Renault;

public class AplicacionFactoria {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Ferrari ferrari1 = context.getBean("ferrari1", Ferrari.class);
		Ferrari ferrari2 = context.getBean("ferrari2", Ferrari.class);
		Fiat fiat1 = context.getBean("fiat1", Fiat.class);
		Fiat fiat2 = context.getBean("fiat2", Fiat.class);
		Renault renault1 = context.getBean("renault1", Renault.class);
		Renault renault2 = context.getBean("renault2", Renault.class);
		
		Factoria factoria1 = context.getBean("factoria1", Factoria.class);
		
		Ferrari ferrari3 = (Ferrari) factoria1.crearCoche("Ferrari");

	}

}
