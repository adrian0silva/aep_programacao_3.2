package br.com.unicesumar.aep.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aluno {
	
	@Id
	private String id;
	
	private String nome;
}
