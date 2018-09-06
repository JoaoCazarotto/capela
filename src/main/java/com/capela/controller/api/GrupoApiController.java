package com.capela.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.capela.model.Grupo;
import com.capela.service.GrupoServiceInterface;

public class GrupoApiController {
	@Autowired
	private GrupoServiceInterface grupoServiceInterface;
	
	@CrossOrigin(value = "*")
	@GetMapping(value = "api/listarGrupo", produces = "application/json; charset=UTF-8")
	public @ResponseBody List<Grupo> listarGrupo() {
		return grupoServiceInterface.listarGrupo();
	}
	
	@CrossOrigin(value = "*")
	@PostMapping(value = "api/deletagrupo", produces = "application/json; charset=UTF-8")
	public void deletaGrupo(@RequestBody Long id) {
		grupoServiceInterface.deletarGrupo(id);
	}
	
	

	
}
