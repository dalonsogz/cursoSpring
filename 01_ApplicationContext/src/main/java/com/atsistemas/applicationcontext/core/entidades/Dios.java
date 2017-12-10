package com.atsistemas.applicationcontext.core.entidades;

public class Dios {

	private static final Dios instance = new Dios();

	private String tipo = "Adan";
	
	private Dios() {
		// TODO Auto-generated constructor stub
	}
	
	public static Dios getInstance() {
		return instance;
	}
	
	public String crearHombres() {
		if("Adan".equals(tipo)) {
			return "Adan";
		} else if ("Eva".equals(tipo)) {
			return "Eva";
		} else {
			return null;
		}
	}
	
}
