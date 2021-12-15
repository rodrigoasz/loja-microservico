package br.com.lecom.rodrigo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lecom.rodrigo.Dto.PedidoDto;
import br.com.lecom.rodrigo.model.Pedido;
import br.com.lecom.rodrigo.service.PedidoService;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

	@Autowired
	private PedidoService pedidoService;
	
	@GetMapping()
	public List<Pedido> findAll() {
		List<Pedido> pedidos = pedidoService.findAll();

		return pedidos;
	}
	
	@GetMapping(value="/{id}")
	public Optional<Pedido> findId(@PathVariable long id) {
		Optional<Pedido> pedido = pedidoService.findId(id);


		return pedido;
	}
	
	@PostMapping()
	public Pedido realizaPedido(@RequestBody PedidoDto pedidoDto) {
		Pedido pedido = pedidoService.fluxoPedido(pedidoDto);
		return pedido;
	}

}
