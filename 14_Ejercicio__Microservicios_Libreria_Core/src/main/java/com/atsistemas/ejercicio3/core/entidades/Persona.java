package com.atsistemas.ejercicio3.core.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Persona {

	@Id
	private Long id;
	private String name;
	private int age;

	public Persona(Long id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}