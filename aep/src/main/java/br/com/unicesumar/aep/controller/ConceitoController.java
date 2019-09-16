package br.com.unicesumar.aep.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.unicesumar.aep.modelo.Conceito;
import br.com.unicesumar.aep.repository.ConceitoRepository;

@RequestMapping("/api/conceito")
@RestController
public class ConceitoController {

	@Autowired
	private ConceitoRepository conceitoRepository;
	
	@GetMapping
	public List<Conceito> buscarTodos() {
		return conceitoRepository.findAll();
	}
	
	@GetMapping("{id}")
	public Conceito buscarPeloId(@PathVariable("id") String id) {
		return conceitoRepository.findById(id).get();
	}
	
	@PostMapping
	public Conceito salvar(@RequestBody Conceito conceito) {
		return conceitoRepository.save(conceito);
	}
	
	@PutMapping("/{id}")
	public void alterar(@PathVariable("id") String id,@RequestBody Conceito novoConceito) {
		if (!id.equals(novoConceito.getId())) {
			throw new RuntimeException("Ids devem ser iguais!");
		}
		conceitoRepository.save(novoConceito);
	}
	
	@DeleteMapping("/{id}")
	public void remover(@PathVariable String id) {
		conceitoRepository.deleteById(id);
	}
	
}
