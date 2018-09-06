package com.capela.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.capela.model.Evento;
import com.capela.service.EventoServiceInterface;

public class EventoApiController {
	@Autowired
	private EventoServiceInterface eventoServiceInterface;
	
	@CrossOrigin("*")
	@GetMapping(value = "api/listarEventos", produces = "application/json; charset=UTF-8")
	public @ResponseBody List<Evento> listarEvento() {
		return eventoServiceInterface.listarEventos();	
	}
	
	@CrossOrigin("*")
	@PostMapping("api/deletarEvento")
	public void deletarEvento(@RequestBody Long id) {
		eventoServiceInterface.deletarEvento(id);
	}
	
	@CrossOrigin("*")
	@PostMapping("api/listarEventoGrupo")
	public List<Evento> ListarEventoGrupo(@RequestBody Long id) {
		return eventoServiceInterface.listaEventoGrupo(id);
	}
}
