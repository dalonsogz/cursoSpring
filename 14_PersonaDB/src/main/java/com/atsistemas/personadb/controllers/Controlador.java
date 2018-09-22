package com.atsistemas.personadb.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.atsistemas.personadb.entidades.Persona;
import com.atsistemas.personadb.persistencia.servicios.ServicioPersonas;

@Controller
@RequestMapping(path="/persona")
public class Controlador {

	@Autowired
	ServicioPersonas servicioPersonas;
	
	@RequestMapping(path="/insert", method=RequestMethod.POST)
//	public String insert(@RequestBody Persona persona) {
	public String insert(
			//@ModelAttribute("persona") Persona persona
			//@RequestBody Persona persona
			@RequestBody MultiValueMap<String,String> formParams)
			{
		Persona persona = new Persona(
				Long.parseLong(formParams.getFirst("persona.pk")),
				formParams.getFirst("persona.nombre"),
				Integer.parseInt(formParams.getFirst("persona.edad")));
		
		servicioPersonas.insertar((Persona)persona);
		return "redirect:persona?nombre=" + ((Persona)persona).getNombre();
	}


	@RequestMapping(path="/findbyname", method=RequestMethod.GET)
	public ModelAndView findbyname(Persona persona) {
		ModelAndView mav = new ModelAndView();
		
		List<Persona> personas = null;
		if (persona!=null)
			personas = servicioPersonas.findByNombre(persona.getNombre());
		
		if (personas!=null)
			mav.addObject("persona",personas.get(0));
		
		mav.setViewName("persona/detalle");
		
		return mav;
	}
	
	@RequestMapping(path="/buscarpornombre", method=RequestMethod.GET)
	public String buscarPorNombre(@RequestParam String nombre, Model model) {
		
		List<Persona> resultado = null;
		if (nombre!=null)
			resultado = servicioPersonas.findByNombre(nombre);
		
		model.addAttribute("resultado",resultado);
		
		return "persona/detalle";
	}
}
