package com.onixlab.cursos;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Curso {
	private Long id;
	
	@NotEmpty @Size(min=2)
	private String nome;
	
	private Double cargaHoraria;

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

	public Double getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Double cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	// getters and setters

}
