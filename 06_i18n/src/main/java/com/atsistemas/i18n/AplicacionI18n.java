package com.atsistemas.i18n;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AplicacionI18n {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		System.out.println(context.getMessage("views.home.title", new Object[] {"Victor"}, Locale.ENGLISH));
		
		System.out.println(context.getMessage("views.home.title", new Object[] {"Victor"}, new Locale("es", "ES")));
	
		LecturaDeMensajes lecturaDeMensajes = context.getBean(LecturaDeMensajes.class);
		
		lecturaDeMensajes.mostrarMensajes();
		
	}
}
