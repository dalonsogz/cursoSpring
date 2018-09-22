package com.atsistemas.ejercicio3.core.dto;

import java.io.Serializable;

public class PersonaDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String nombre;
	private int edad;

	public PersonaDto(Long id, String nombre, int edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
	}

	public PersonaDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "PersonaDto [id=" + id + ", nombre=" + nombre + ", edad=" + edad + "]";
	}

}
