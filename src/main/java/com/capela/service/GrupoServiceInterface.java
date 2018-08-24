package com.capela.service;

import java.util.List;

import com.capela.model.Grupo;

public interface GrupoServiceInterface {
	public List<Grupo> listarGrupo();
	public void deletarGrupo(Long id);
	public void editarGrupo(Grupo g);
	public void criarGrupo(Grupo g);
}
