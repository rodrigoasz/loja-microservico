package br.com.lecom.rodrigo.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lecom.rodrigo.Dto.PedidoDto;
import br.com.lecom.rodrigo.Dto.PedidoEntregaDto;
import br.com.lecom.rodrigo.model.Endereco;
import br.com.lecom.rodrigo.model.Loja;
import br.com.lecom.rodrigo.model.Pedido;
import br.com.lecom.rodrigo.proxy.TransportadoraProxy;
import br.com.lecom.rodrigo.response.CodRastreioResponse;
import br.com.lecom.rodrigo.response.ProdutoResponse;
import br.com.lecom.rodrigo.service.PedidoService;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

	@Autowired
	private PedidoService pedidoService;
	
	@GetMapping()
	public List<Pedido> findAll() {
		List<Pedido> pedidos = MockPedidos();

		return pedidos;
	}
	@GetMapping(value="/{id}")
	public Pedido findId(@PathVariable int id) {
		List<Pedido> pedidos = MockPedidos();
		Pedido pedido = pedidos.get(id);

		return pedido;
	}
	
	@PostMapping()
	public Pedido realizaPedido(@RequestBody PedidoDto pedidoDto) {
		Pedido pedido = pedidoService.realizaPedido(pedidoDto);
		return pedido;
	}

	private List<Pedido> MockPedidos() {
		List<Pedido> pedidos = new ArrayList<>();

		ProdutoResponse produto1 = new ProdutoResponse((long) 1, "Produto " + 1, BigDecimal.TEN);
		ProdutoResponse produto2 = new ProdutoResponse((long) 2, "Produto " + 2, BigDecimal.ONE);

		List<ProdutoResponse> produtos = new ArrayList<>();
		produtos.add(produto1);
		produtos.add(produto2);
		List<ProdutoResponse> produtos1 = new ArrayList<>();
		produtos1.add(produto1);

		Endereco enderecoDestino = new Endereco("Rua Sebastiao 1-30", "Vila Maria", "Bauru", "São Paulo", "30.451-908");
////		Pedido pedido = new Pedido((long) 0, produtos, enderecoDestino, Loja.LOJA_ENDERECO, BigDecimal.TEN, "");
////		Pedido pedido2 = new Pedido((long) 1, produtos1, enderecoDestino, Loja.LOJA_ENDERECO, BigDecimal.ONE, "");
//
//		pedidos.add(pedido);
//		pedidos.add(pedido2);

		return pedidos;
	}
}
