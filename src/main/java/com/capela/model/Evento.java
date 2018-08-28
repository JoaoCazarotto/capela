package com.capela.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "eventos")
public class Evento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String endereco;
	@ManyToOne(fetch=FetchType.LAZY)
	private Grupo grupo;
	@Column(name = "data_hora")
	private LocalDateTime dataHora;
	private byte foto;
	private String descricao;
	
	public Evento(String nome, String endereco, Grupo grupo, LocalDateTime dataHora, byte foto, String descricao) {
		this.nome = nome;
		this.endereco = endereco;
		this.grupo = grupo;
		this.dataHora = dataHora;
		this.foto = foto;
	}
	
	public Evento(String nome, String endereco, Grupo grupo, LocalDateTime dataHora,String descricao) {
		this.nome = nome;
		this.endereco = endereco;
		this.grupo = grupo;
		this.dataHora = dataHora;
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
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Grupo getGrupo() {
		return grupo;
	}
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	
	public LocalDateTime getDataHora() {
		return dataHora;
	}
	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}
	public byte getFoto() {
		return foto;
	}
	public void setFoto(byte foto) {
		this.foto = foto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}
