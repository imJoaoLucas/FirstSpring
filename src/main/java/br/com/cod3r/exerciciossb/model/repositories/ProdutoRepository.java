package br.com.cod3r.exerciciossb.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cod3r.exerciciossb.model.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

	public Iterable<Produto> findByNomeContaining(String nome); 
}
