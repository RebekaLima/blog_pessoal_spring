package com.generation.blogpessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.blogpessoal.model.Postagem;

public interface PostagemRepository extends JpaRepository<Postagem, Long> {
		
	// Classe Postagem: É a entidade que será mapeada no Banco de Dados (Referente a que criou a tabela)
	// Long: Representa a Chave Primária (PK) que é o atributo que reecebeu a anotação @Id
	
}
