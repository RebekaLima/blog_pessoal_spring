package com.generation.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.blogpessoal.model.Postagem;

public interface PostagemRepository extends JpaRepository<Postagem, Long> {
		
	// Classe Postagem: É a entidade que será mapeada no Banco de Dados (Referente a que criou a tabela)
	// Long: Representa a Chave Primária (PK) que é o atributo que reecebeu a anotação @Id
	
	public List <Postagem> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo); //finb By Titulo String titulo
	
}
