package com.capela.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.capela.model.Evento;
import com.capela.service.EventoServiceInterface;

@Controller
public class HomeController {
	
	@Autowired
	private EventoServiceInterface eventoServiceInterface;
	
	@GetMapping("/")
	public ModelAndView Home(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		List<Evento> eventos = eventoServiceInterface.listarEventos();
		mav.addObject("lista_eventos", eventos);
		return mav;
	}
}
