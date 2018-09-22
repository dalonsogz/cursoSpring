package com.atsistemas.compras.entidades;

import java.util.Set;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "empresatransporte")
@Access(AccessType.FIELD)
public class EmpresaTransporte {

	@Id
	private int id;
	private String name;
	private String region;
	@OneToMany(fetch = FetchType.EAGER,mappedBy="empresaTransporte")
	private Set<Compra> compras;

	public EmpresaTransporte() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmpresaTransporte(Integer id, String name, String region) {
		super();
		this.id = id;
		this.name = name;
		this.region = region;
	}

	@Override
	public String toString() {
		return "EmpresaTransporte [id=" + id + ", name=" + name + ", region=" + region + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Set<Compra> getCompras() {
		return compras;
	}

	public void setCompras(Set<Compra> compras) {
		this.compras = compras;
	}

	public void setId(int id) {
		this.id = id;
	}

}
