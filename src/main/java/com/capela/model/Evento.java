package com.capela.model;

import java.sql.Time;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;



@Entity
@Table(name = "eventos")
public class Evento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	private String nome;
	@NotNull
	private String endereco;
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "eventos")
	private List<Grupo> grupo;
	@NotNull
	private Date data;
	@NotNull
	private Time hora;
	private byte foto;
	private String descricao;
	private String facebook;
	private String whatsapp;
	
	public Evento() {}
	
	public Evento(String nome, String endereco, List<Grupo> grupo, Date data , Time hora, byte foto, String descricao) {
		this.nome = nome;
		this.endereco = endereco;
		this.grupo = grupo;
		this.data = data;
		this.hora = hora;
		this.foto = foto;
	}
	
	public Evento(String nome, String endereco, List<Grupo> grupo, Date data, Time hora,String descricao) {
		this.nome = nome;
		this.endereco = endereco;
		this.grupo = grupo;
		this.data = data;
		this.hora=hora;
		this.descricao=descricao;
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
	public List<Grupo> getGrupo() {
		return grupo;
	}
	public void setGrupo(List<Grupo> grupo) {
		this.grupo = grupo;
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

	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Time getHora() {
		return hora;
	}
	public void setHora(Time hora) {
		this.hora = hora;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getWhatsapp() {
		return whatsapp;
	}

	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}

	
}
