package com.atsistemas.colecciones;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Persona {

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", amigos=" + amigos + "]";
	}

	private String nombre;
	
	@Autowired
	private List<Persona> amigos;
	
	public Persona() {
		super();
		System.out.println("Se ha creado el objeto, pero todavia no tenemos el nombre: " + nombre);
	}

	@Autowired
	public void setNombre(@Qualifier("victor") String nombre) {
		System.out.println("Seteando nombre: " + nombre);
		this.nombre = nombre;
	}
	
	public List<Persona> getAmigos() {
		return amigos;
	}

	public void setAmigos(List<Persona> amigos) {
		this.amigos = amigos;
	}

	@PostConstruct
	public void init() {
		System.out.println("Aqui ya se ha terminado de inicializar el objeto por completo con los setter: " + nombre);
	}
	
}
