package com.capela.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import com.capela.model.Grupo;
import com.capela.service.GrupoServiceInterface;

@Controller
public class GrupoController {
		
		@Autowired
		private GrupoServiceInterface grupoServiceInterface;
	
		@GetMapping("/listarGrupo/{id}")
		public ModelAndView listarGrupo(@PathVariable ("id") Long id) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/listarGrupo");
		List<Grupo> grupos = grupoServiceInterface.listarGrupo();
		mav.addObject("lista_grupos", grupos);
		return mav;
		}
	
		@PostMapping("/deletagrupo")
		public ModelAndView deletaGrupo(@RequestBody Long id) {
		grupoServiceInterface.deletarGrupo(id);
		return new ModelAndView ("/deletaGrupo");
		}
	
		@PostMapping("/editaGrupo")
		public ModelAndView editaGrupo(@RequestBody Grupo g) {
		grupoServiceInterface.editarGrupo(g);
		return new ModelAndView ("/editaGrupo");
		}
	
		@PostMapping("/adicionarGrupo")
		public ModelAndView CriarGrupo(@RequestBody Grupo g) {
			grupoServiceInterface.criarGrupo(g);
			return new ModelAndView("/adicionarGrupo");
		}
	
}
