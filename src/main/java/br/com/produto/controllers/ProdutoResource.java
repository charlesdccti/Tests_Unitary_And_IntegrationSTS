package br.com.produto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.produto.domains.Produto;
import br.com.produto.repositories.ProdutoRepository;

@RestController
@RequestMapping(value="/produtos")
public class ProdutoResource {

	@Autowired
	private ProdutoRepository repo;
	
	@GetMapping(value="{id}")
	public Produto findById(@PathVariable Integer id) {
		return repo.findById(id).get();
	}
}
