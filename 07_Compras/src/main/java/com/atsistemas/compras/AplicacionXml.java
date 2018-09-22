package com.atsistemas.compras;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atsistemas.compras.entidades.Compra;
import com.atsistemas.compras.servicios.Servicio;

public class AplicacionXml {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Servicio servicio = context.getBean(Servicio.class);
		List<Compra> compras = servicio.consultarTodos();
		System.out.println("Resultado:" + compras);

		System.out.println("Resultado2:");
		for (Compra compra:compras) {
			System.out.println("-->" + compra.getEmpresaTransporte().getCompras());
		}
		
		
	}

}
