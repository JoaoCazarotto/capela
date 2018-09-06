package com.capela.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import com.capela.model.Evento;
import com.capela.service.EventoServiceInterface;


@RestController
public class HomeApiController{
	@Autowired
	private EventoServiceInterface eventoServiceInterface;
	
	@CrossOrigin("*")
	@GetMapping("/api")
	public List<Evento> Home(){
		return eventoServiceInterface.listarEventos();
	}
}

