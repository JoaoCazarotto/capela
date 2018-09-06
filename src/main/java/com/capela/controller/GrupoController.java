package com.capela.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.capela.model.Grupo;
import com.capela.service.GrupoServiceInterface;


@Controller
public class GrupoController {
		
		@Autowired
		private GrupoServiceInterface grupoServiceInterface;
		
		@GetMapping("/editarGrupo/{id}")
		public ModelAndView editarGrupo(@PathVariable Long id) {
			ModelAndView mav = new ModelAndView();
			mav.setViewName("adicionarGrupo");
			mav.addObject("grupo", grupoServiceInterface.buscaGrupo(id));
			return mav;
		}
			
		@PostMapping("/editarGrupo")
		public void editaGrupo(@RequestBody Grupo grupo) {
		grupoServiceInterface.editarGrupo(grupo);
		}
		
		@GetMapping("/adicionarGrupo")
		public ModelAndView CriarGrupo() {
			ModelAndView mav = new ModelAndView();
			mav.setViewName("adicionarGrupo");
			mav.addObject("grupo", new Grupo());
			return mav;
		}
	
		@PostMapping("/adicionarGrupo")
		public void CriarGrupo(@ModelAttribute Grupo grupo) {
			grupoServiceInterface.criarGrupo(grupo);
		}
		
}
