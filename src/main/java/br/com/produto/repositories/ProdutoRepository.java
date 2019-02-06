/**
 * 
 */
package br.com.produto.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import br.com.produto.domains.Produto;

/**
 * @author charles
 *
 */
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

	/*
	 * select p from Produto p where p.descricao like '%%'
	 */
	public List<Produto> findByDescricaoContaining(@Param("descricao") String string);

}