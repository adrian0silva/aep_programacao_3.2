package br.com.unicesumar.aep.modelo;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Nota {

	@Id
	private String id;
	
	@Column(nullable = false)
	private Double valor;

	public Nota() {
		id = UUID.randomUUID().toString();
	}

	public Double getValor() {
		return valor;
	}
}
