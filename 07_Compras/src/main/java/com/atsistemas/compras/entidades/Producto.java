package com.atsistemas.compras.entidades;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "producto")
@Access(AccessType.FIELD)
public class Producto {

	@Id
	private Integer id;
	private String name;
	private String description;
	private Integer amount;
	private Float prize;

	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Producto(Integer id, String name, String description, Integer amount, Float prize) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.amount = amount;
		this.prize = prize;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", name=" + name + ", description=" + description + ", amount=" + amount
				+ ", prize=" + prize + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Float getPrize() {
		return prize;
	}

	public void setPrize(Float prize) {
		this.prize = prize;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
