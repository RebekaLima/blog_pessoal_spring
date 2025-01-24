package com.generation.blogpessoal.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity //Indicação de que é uma entidade sendo criada
@Table(name = "tb_postagens") // Título da tabela
public class Postagem {
	
	@Id // Indicativo de que é uma chave primária
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// @GeneratedValue -> Indica que a chave primárica será gerada pelo Banco de dados
	// strategy = GenerationType.IDENTITY -> Indica de que forma a chave será gerada através do auto-increment do SQL
	private Long id; // Long = BIGINT
	
	@NotBlank(message = "O atributo título é obrigatório!") //NotBlank não permite que o valor seja nulo
	@Size(min = 5, max = 100, message = "o atributo texto deve conter no mínimo 10 e no máximo 1000 caracteres") //Size define o valor mínimo e máximo de caracteres
	private String titulo; //String = VARCHAR(100)
	
	@NotBlank(message = "O atributo texto é obrigátório!")
	@Size(min = 5, max = 1000, message = "O atributo deve conter no mínimo 10 e no máximo 1000 caracteres")
	private String texto;
	
	@UpdateTimestamp //Configura o atributo como Timestamp
	private LocalDateTime data;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}
	
}
