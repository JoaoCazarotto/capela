package com.capela.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.capela.model.Evento;
import com.capela.model.Grupo;
import com.capela.service.EventoServiceInterface;
import com.capela.service.GrupoServiceInterface;

@Controller
public class HomeController{
	@Autowired
	private EventoServiceInterface eventoServiceInterface;
	@Autowired
	private GrupoServiceInterface grupoServiceInterface;
	
	@GetMapping("/")
	public ModelAndView Home(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		List<Evento> eventos = eventoServiceInterface.listarEventos();
		mav.addObject("lista_eventos", eventos);
		List<Grupo> grupos = grupoServiceInterface.listarGrupo();
		mav.addObject("lista_grupo", grupos);
		return mav;
		
	    }

		@Bean
	    public ViewResolver getViewResolver() {
	        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	        resolver.setPrefix("resources/templates/");
	        resolver.setSuffix(".jsp");
	        return resolver;
	    }
	
	
}
