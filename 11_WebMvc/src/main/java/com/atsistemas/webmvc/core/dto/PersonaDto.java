package com.atsistemas.webmvc.core.dto;

public class PersonaDto {
	private String nombre;
	private int edad;
	
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
	public PersonaDto(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	public PersonaDto() {
		super();
	}
}
