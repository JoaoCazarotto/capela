package com.capela.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import com.capela.model.*;
import com.capela.service.EventoServiceInterface;

@Controller
public class EventoController {
	@Autowired
	private EventoServiceInterface eventoServiceInterface;		
	
	@GetMapping("/listarEventos")
	public ModelAndView listarEvento() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/listarEvento");
		List<Evento> eventos = eventoServiceInterface.listarEventos();
		mav.addObject("lista_eventos", eventos);
		return mav;
	}
	
	@GetMapping("/deletarEvento/{id}")
	public ModelAndView deletarEvento(@PathVariable ("id") Long id) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/deletarEvento");
		eventoServiceInterface.deletarEvento(id);
		return mav;
	}
	
	@PostMapping("/editarEvento")
	public ModelAndView editarEvento(@RequestBody Evento e) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/editarEvento");
		eventoServiceInterface.editarEvento(e);
		return mav;
	}
	
	@PostMapping("/listarEventoGrupo")
	public ModelAndView ListarEventoGrupo(@RequestBody Long id) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/listarEventoGrupo");
		List<Evento> eventosGrupo = eventoServiceInterface.listaEventoGrupo(id);
		mav.addObject("lista_eventos_grupos", eventosGrupo);
		return mav;
	}
	
	@PostMapping("/adicionarEvento")
	public ModelAndView CriarEvento(@RequestBody Evento e){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/adicionarEvento");
		eventoServiceInterface.criaEvento(e);
		return mav;
	}
	
}
