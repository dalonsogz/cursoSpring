package com.atsistemas.factoria.core.entidades;

public class Factoria {

	private Empleado director;
	
	public Factoria(Empleado director) {
		super();
		this.director = director;
	}

	public Coche crearCoche(String tipo) {
		switch (tipo) {
		case "Ferrari":
			return new Ferrari();
		case "Fiat":
			return new Fiat();
		case "Renault":
			return new Renault();
		default:
			throw new RuntimeException();
		}
	}

}
