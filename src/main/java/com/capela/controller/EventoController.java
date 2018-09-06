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
	
	@GetMapping("/editarEvento")
	public ModelAndView editarEvento(@RequestBody Long id) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("adicionarEvento");
		mav.addObject("evento", eventoServiceInterface.buscarEvento(id));
		return mav;
	}
	
	@PostMapping("/editarEvento")
	public void editarEvento(@RequestBody Evento e) {
		eventoServiceInterface.editarEvento(e);
	}
	
	
	@GetMapping("/adicionarEvento")
	public ModelAndView CriarEvento(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("adicionarEvento");
		mav.addObject("evento", new Evento());
		return mav;
	}
	
	@PostMapping("/adicionarEvento")
	public void CriarEvento(@RequestBody Evento e){
		eventoServiceInterface.criaEvento(e);
	}
	
}
