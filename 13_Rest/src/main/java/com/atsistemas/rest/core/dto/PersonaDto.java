package com.atsistemas.rest.core.dto;

public class PersonaDto {
	private long pk;
	public PersonaDto(long pk, String nombre, int edad) {
		super();
		this.pk = pk;
		this.nombre = nombre;
		this.edad = edad;
	}
	public long getPk() {
		return pk;
	}
	public void setPk(long pk) {
		this.pk = pk;
	}
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
