package br.com.unicesumar.aep.modelo;

import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Conceito {
	
	@Id
	private String id;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Nota nota;


	@OneToOne(cascade = CascadeType.ALL)
	private Avaliacao avaliacao;
	

	@OneToOne(cascade = CascadeType.ALL)
	private Aluno aluno;
	
	public Conceito(){
		 id = UUID.randomUUID().toString();
	}
	
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}
	public void setNota(Nota nota) {
		this.nota = nota;
	}
	
	public Aluno getAluno() {
		return aluno;
	}
	public Avaliacao getAvaliacao() {
		return avaliacao;
	}
	public String getId() {
		return id;
	}
	public Nota getNota() {
		return nota;
	}
}
