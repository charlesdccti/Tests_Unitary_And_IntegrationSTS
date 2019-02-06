/**
 * 
 */
package br.com.produto.repositories;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.produto.domains.Produto;

/**
 * @author charles
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProdutoRepositoryTest {
	
	@Autowired
	private ProdutoRepository repo;
	
	@Test
	public void testaProdutoHavaina() {

		List<Produto> produtos = repo.findByDescricaoContaining("Hava");
		assertThat(produtos.size()).isEqualTo(1);
		assertThat(produtos.get(0).getDescricao().equals("Sandalia Havaiana"));
	}
	
	@Test
	public void testaProdutoSapato() {

		List<Produto> produtos = repo.findByDescricaoContaining("Sapato");
		assertThat(produtos.size()).isEqualTo(0);
	}

	@Test
	public void testaIdHavaiana() {

		Optional<Produto> produto = repo.findById(1);
		assertThat(produto.get().getDescricao().equals("Sandalia Havaiana"));
	}

}
