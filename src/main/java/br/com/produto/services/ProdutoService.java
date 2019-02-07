/**
 * 
 */
package br.com.produto.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.produto.domains.Produto;
import br.com.produto.repositories.ProdutoRepository;

/**
 * @author charles
 *
 */
@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repo;
	
	public Optional<Produto> buscaPorId(Integer id) {
		return repo.findById(id);
	}
	
	
}
