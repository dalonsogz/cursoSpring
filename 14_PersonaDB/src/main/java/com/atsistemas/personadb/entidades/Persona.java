package com.atsistemas.personadb.entidades;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PERSONAS")
@Access(AccessType.FIELD)
public class Persona {

	@Id
	private long pk;
	private String nombre;
	private int edad;

	public Persona() {
		super();
	}

	public Persona(long pk, String nombre, int edad) {
		super();
		this.pk = pk;
		this.nombre = nombre;
		this.edad = edad;
	}

	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "Persona [pk=" + pk + ", nombre=" + nombre + ", edad=" + edad + "]";
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
