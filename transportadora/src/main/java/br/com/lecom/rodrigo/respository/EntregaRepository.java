package br.com.lecom.rodrigo.respository;

import org.springframework.data.repository.CrudRepository;

import br.com.lecom.rodrigo.model.EntregaPedido;

public interface EntregaRepository extends CrudRepository<EntregaPedido, Long> {

}
