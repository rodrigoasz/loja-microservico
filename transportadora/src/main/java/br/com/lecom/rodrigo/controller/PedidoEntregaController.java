package br.com.lecom.rodrigo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lecom.rodrigo.Dto.CodigoRastreioDto;
import br.com.lecom.rodrigo.model.EntregaPedido;
import br.com.lecom.rodrigo.response.PedidoEntregaResponse;
import br.com.lecom.rodrigo.service.CodigoRastreioService;

@RestController
@RequestMapping(value="/entrega")
public class PedidoEntregaController {
	@Autowired
	private CodigoRastreioService service;
	
	@PostMapping
	public CodigoRastreioDto enviaPostagem(@RequestBody PedidoEntregaResponse response) {
		
		
		return service.geraCodigoRastreio(response);			
	}
}
