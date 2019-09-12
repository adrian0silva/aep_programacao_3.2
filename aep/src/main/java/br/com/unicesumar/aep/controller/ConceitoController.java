package br.com.unicesumar.aep.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.unicesumar.aep.modelo.Conceito;
import br.com.unicesumar.aep.repository.ConceitoRepository;

@RequestMapping("/api/conceito")
public class ConceitoController {

	@Autowired
	ConceitoRepository conceitoRepository;
	
	
}
