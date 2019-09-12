package br.com.unicesumar.aep.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Conceito {
	
	@Id
	private String id;
	

	@OneToOne
	private Aluno aluno;
	
	
}
