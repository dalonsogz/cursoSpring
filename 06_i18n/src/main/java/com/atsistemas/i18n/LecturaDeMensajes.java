package com.atsistemas.i18n;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class LecturaDeMensajes {

	@Autowired
	private MessageSource messageSource;

	public void mostrarMensajes() {
		System.out.println(messageSource.getMessage("views.home.title", new Object[] { "Victor" }, Locale.ENGLISH));

		System.out.println(messageSource.getMessage("views.home.title", new Object[] { "Victor" }, new Locale("en_US", "en_US")));

	}

}
