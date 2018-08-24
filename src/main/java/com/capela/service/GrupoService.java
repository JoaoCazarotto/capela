package com.capela.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capela.model.Grupo;
import com.capela.repository.GrupoRepository;

@Service
public class GrupoService implements GrupoServiceInterface {
	@Autowired
	private GrupoRepository grupoInterface;
	
	public List<Grupo> listarGrupo(){
		return grupoInterface.findAll();
	}
	
	public void deletarGrupo(Long id) {
		grupoInterface.deleteById(id);
	}
	
	public void editarGrupo(Grupo g) {
		grupoInterface.saveAndFlush(g);
	}
	
	public void criarGrupo(Grupo g) {
		grupoInterface.save(g);
	}
}
