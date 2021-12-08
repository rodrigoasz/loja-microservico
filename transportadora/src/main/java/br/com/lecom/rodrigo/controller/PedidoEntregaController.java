package br.com.lecom.rodrigo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lecom.rodrigo.Dto.CodigoRastreioDto;
import br.com.lecom.rodrigo.model.EntregaPedido;
import br.com.lecom.rodrigo.response.PedidoEntregaResponse;

@RestController
@RequestMapping(value="/entrega")
public class PedidoEntregaController {
	@PostMapping
	public CodigoRastreioDto enviaPostagem(@RequestBody PedidoEntregaResponse response) {
		EntregaPedido entrega = new EntregaPedido(response);
		CodigoRastreioDto rastreio = new CodigoRastreioDto(entrega.getPrevisaoParaEntrega(),entrega.getCodRastreio());
		return rastreio;			
	}
}
