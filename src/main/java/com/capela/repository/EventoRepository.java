package com.capela.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capela.model.Evento;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Long> {
	
	@Query("SELECT e FROM Evento AS e WHERE e.grupo.id = :id ")
	public List<Evento> findEventoByGrupoId(Long id);
	
}
