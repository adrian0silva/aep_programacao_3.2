package br.com.unicesumar.aep.modelo;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aluno {

	@Id
	private String id;

	@Column(nullable = false)
	private String nome;

	public Aluno() {
		id = UUID.randomUUID().toString();
	}

	public String getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}
}
