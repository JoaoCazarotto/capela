package com.capela.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.capela.model.*;
import com.capela.service.EventoServiceInterface;

@RestController
public class EventoController {
	@Autowired
	private EventoServiceInterface eventoServiceInterface;		
	
	@GetMapping("/api/listarEventos")
	public List<Evento> listarEvento() {
		return eventoServiceInterface.listarEventos();	
	}
	
	@GetMapping("/deletarEvento/{id}")
	public ModelAndView deletarEvento(@PathVariable ("id") Long id) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("deletarEvento");
		eventoServiceInterface.deletarEvento(id);
		return mav;
	}
	
	@PostMapping("/editarEvento")
	public ModelAndView editarEvento(@RequestBody Evento e) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("editarEvento");
		eventoServiceInterface.editarEvento(e);
		return mav;
	}
	
	@PostMapping("/api/listarEventoGrupo")
	public List<Evento> ListarEventoGrupo(@RequestBody Long id) {
		return eventoServiceInterface.listaEventoGrupo(id);
	}
	
	@PostMapping("/adicionarEvento")
	public ModelAndView CriarEvento(@RequestBody Evento e){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("adicionarEvento");
		eventoServiceInterface.criaEvento(e);
		return mav;
	}
	
}
