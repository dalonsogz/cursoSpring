package com.atsistemas.personadb.modelos;

public class PersonaModel {


	private long pk;
	private String nombre;
	private int edad;

	public PersonaModel() {
		super();
	}

	public PersonaModel(long pk, String nombre, int edad) {
		super();
		this.pk = pk;
		this.nombre = nombre;
		this.edad = edad;
	}

	public PersonaModel(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public long getPk() {
		return pk;
	}

	public void setPk(long pk) {
		this.pk = pk;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
}
