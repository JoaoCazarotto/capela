package com.capela.controller.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.capela.model.Grupo;
import com.capela.service.GrupoServiceInterface;

public class GrupoApiController {
	@Autowired
	private GrupoServiceInterface grupoServiceInterface;
	
	@CrossOrigin(value = "*")
	@PostMapping(value = "api/listarGrupo", produces = "application/json; charset=UTF-8")
	public @ResponseBody List<Grupo> listarGrupo() {
		return grupoServiceInterface.listarGrupo();		
	}
	
	@CrossOrigin("*")
	@PostMapping(value = "api/buscaGrupo", produces = "application/json; charset=UTF-8")
	public @ResponseBody Optional<Grupo> buscaGrupo(Long id) {
		return grupoServiceInterface.buscaGrupo(id);
	}
	

	
}
