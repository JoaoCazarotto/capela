package com.capela.service;

import java.util.List;

import com.capela.model.Evento;

public interface EventoServiceInterface {
	public List<Evento> listarEventos();
	public List<Evento> listaEventoGrupo(Long id);
	public void criaEvento(Evento e);
	public void editarEvento(Evento e);
	public void deletarEvento(Long id);
	
}
