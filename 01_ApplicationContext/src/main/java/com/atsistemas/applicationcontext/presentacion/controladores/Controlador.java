package com.atsistemas.applicationcontext.presentacion.controladores;

import com.atsistemas.applicationcontext.core.servicios.Servicio;

public class Controlador {

	//Dependencia
	private Servicio servicio = null;
	private String nombre;
	
	//Inyecion por contructor (dependencia es obligatoria)
	public Controlador(Servicio servicio) {
		super();
		this.servicio = servicio;
	}
	
	//Inyeccion por Setter (dependencias no obligatorias)
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void procesarPeticion() {
		//Servicio servicio = new ServicioBasico();
		System.out.println("Procesando Peticion");
		servicio.ejecutarRequisito();
	}
	
//	public String toString() {
//		return("Servicio:" + servicio + ",Nombre:" + nombre);
//	}
	
	
}
