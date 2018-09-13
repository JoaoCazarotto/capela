package com.capela.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "grupos")
public class Grupo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	private String nome;
	private String descricao;
	@NotNull
	private String lider;
	private String foto;
	@NotNull
	@OneToOne(fetch = FetchType.LAZY)
	private Login login;
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "grupos_eventos", joinColumns = {@JoinColumn(name = "grupo_id")}, 
										inverseJoinColumns = {@JoinColumn(name = "evento_id")})
	private List<Evento> eventos;
	
	public Grupo() {};
	
	public Grupo(String nome, String descricao, String lider, String foto, List<Evento> eventos) {
		this.nome = nome;
		this.descricao = descricao;
		this.lider = lider;
		this.foto = foto;
		this.eventos = eventos;
	}
	

	public Grupo(String nome, String descricao, String lider) {
		this.nome = nome;
		this.descricao = descricao;
		this.lider = lider;
		
		
	}
	
	public Grupo(String nome, String descricao, String lider, List<Evento> eventos) {
		this.nome = nome;
		this.descricao = descricao;
		this.lider = lider;
		this.eventos = eventos;
	} 

	
	public Grupo(String nome, String descricao, String lider, String foto) {
		this.nome = nome;
		this.descricao = descricao;
		this.lider = lider;
		this.foto = foto;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getLider() {
		return lider;
	}
	public void setLider(String lider) {
		this.lider = lider;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public List<Evento> getEventos() {
		return eventos;
	}
	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
}
