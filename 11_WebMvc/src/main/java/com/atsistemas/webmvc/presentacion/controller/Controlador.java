package com.atsistemas.webmvc.presentacion.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.JstlView;

import com.atsistemas.webmvc.core.dto.PersonaDto;

@Controller
public class Controlador {

	@RequestMapping(path="/ModelAndView", method=RequestMethod.GET)
	public ModelAndView modelAndView(PersonaDto persona) {
		Map<String, Object> model = new HashMap<>();
		model.put("clave", persona);
		return new ModelAndView("home", model);
	}
	
	@RequestMapping(path="/View", method=RequestMethod.GET)
	public View view(PersonaDto persona, Model model) {
		model.addAttribute("clave", persona);
		return new JstlView("/WEB-INF/views/home.jsp");
	}
	
	//Para este método del controlador se emplea el ViewResolver, por lo que
	//obtenemos un desacoplamiento del controlador con la tecnologia de las
	//vistas a emplear
	@RequestMapping(path="/Clave", method=RequestMethod.GET)
	public String clave(PersonaDto persona, Model model) {
		model.addAttribute("clave", persona);
		return "home";
	}
	
}
