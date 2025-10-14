package com.pedro.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Embeddable
public class Publicacao {
	
	@Column (nullable = false, length = 25)
	@Size (max = 25)
	@NotBlank (message = "Informe o autor: ")
	private String autor;
	
	@Column (nullable = false)
	@NotBlank (message = "Informe a data da publicação: ")
	private String dataPublicacao;
	
	@Column 
	private String editora;

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(String dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	
}
