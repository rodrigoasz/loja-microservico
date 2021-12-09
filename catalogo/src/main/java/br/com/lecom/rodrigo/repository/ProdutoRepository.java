package br.com.lecom.rodrigo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.lecom.rodrigo.model.Produto;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Long> {
	

}
