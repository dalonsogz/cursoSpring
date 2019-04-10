package com.example.config.bus.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/HolaMundo")
@RefreshScope
public class HolaMundoController {

	//Configuracion que permite leer un propertie del fichero application.properties
	@Value("${message:Este valor es el por defecto}")
	private String mensaje;
	
	@GetMapping(path="/Saludar")
	public String metodo(){
		return mensaje;
	}
	
	
}
