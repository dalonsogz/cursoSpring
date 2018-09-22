package com.atsistemas.compras.entidades;

import java.util.Set;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "compra")
@Access(AccessType.FIELD)
public class Compra {

	@Id
	private Integer id;
	@ManyToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "producto_id")
	private Set<Producto> productos;
	private String direccionEntrega;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "empresatransporte_id")
	private EmpresaTransporte empresaTransporte;

	
	public Compra() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Compra(Integer id, Set<Producto> productos, String direccionEntrega, EmpresaTransporte empresaTransporte) {
		super();
		this.id = id;
		this.productos = productos;
		this.direccionEntrega = direccionEntrega;
		this.empresaTransporte = empresaTransporte;
	}

	@Override
	public String toString() {
		return "Compra [id=" + id + ", productos=" + productos + ", direccionEntrega=" + direccionEntrega
				+ ", empresaTransporte=" + empresaTransporte + "]";
	}
	
	public Set<Producto> getProductos() {
		return productos;
	}

	public void setProductos(Set<Producto> productos) {
		this.productos = productos;
	}

	public String getDireccionEntrega() {
		return direccionEntrega;
	}

	public void setDireccionEntrega(String direccionEntrega) {
		this.direccionEntrega = direccionEntrega;
	}

	public EmpresaTransporte getEmpresaTransporte() {
		return empresaTransporte;
	}

	public void setEmpresaTransporte(EmpresaTransporte empresaTransporte) {
		this.empresaTransporte = empresaTransporte;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
