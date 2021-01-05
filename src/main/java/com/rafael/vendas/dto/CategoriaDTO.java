package com.rafael.vendas.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.rafael.vendas.domain.Categoria;

public class CategoriaDTO implements Serializable{

	private Integer id;
	
	@NotEmpty(message="Preenchimento Obrigratório")
	@Length(min=5, max=80, message="O Tamanho deve ser entre 5 e 80")
	private String nome;
	
	public CategoriaDTO() {
		
	}
	
	public CategoriaDTO(Categoria obj) {
		id = obj.getId();
		nome = obj.getNome();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}