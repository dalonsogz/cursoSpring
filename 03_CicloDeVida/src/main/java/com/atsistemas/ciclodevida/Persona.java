package com.atsistemas.ciclodevida;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Persona {

	private String nombre;
	
	public Persona() {
		super();
		System.out.println("Se ha creado el objeto, pero todavia no tenemos el nombre: " + nombre);
	}

	@Autowired
	public void setNombre(@Qualifier("victor") String nombre) {
		System.out.println("Seteando nombre: " + nombre);
		this.nombre = nombre;
	}

	@PostConstruct
	public void init() {
		System.out.println("Aqui ya se ha terminado de inicializar el objeto por completo con los setter: " + nombre);
	}
	
}
