package br.com.unicesumar.aep.modelo;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Avaliacao {

	@Id
	private String id;
	
	@Column(nullable = false)
	private String status;

	public Avaliacao() {
		id = UUID.randomUUID().toString();
	}

	public String getStatus() {
		return status;
	}
}
