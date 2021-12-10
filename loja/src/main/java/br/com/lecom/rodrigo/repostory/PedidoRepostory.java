package br.com.lecom.rodrigo.repostory;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.lecom.rodrigo.model.Pedido;

@Repository
public interface PedidoRepostory extends CrudRepository<Pedido,Long> {

}
