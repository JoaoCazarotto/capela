package com.capela.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capela.model.Evento;
import com.capela.repository.EventoRepository;

@Service
public class EventoService implements EventoServiceInterface {
	
	@Autowired
	private EventoRepository eventoInterface;
	
	public List<Evento> listarEventos(){
		return eventoInterface.findAll();
	}
	
	public List<Evento> listaEventoGrupo(Long id){
		 return eventoInterface.findEventoByGrupoId(id);
	}
	
	public void criaEvento(Evento e) {
		eventoInterface.save(e);
	}
	
	public void editarEvento(Evento e) {
		eventoInterface.saveAndFlush(e);
	}
	
	public void deletarEvento(Long id) {
		eventoInterface.deleteById(id);
	}
	
	public Optional<Evento> buscarEvento(Long id) {
		return eventoInterface.findById(id);
	}
	
}
