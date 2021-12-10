package br.com.lecom.rodrigo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lecom.rodrigo.Dto.CodigoRastreioDto;
import br.com.lecom.rodrigo.model.EntregaPedido;
import br.com.lecom.rodrigo.response.PedidoEntregaResponse;
import br.com.lecom.rodrigo.respository.EntregaRepository;

@Service
public class CodigoRastreioService {

	@Autowired
	private EntregaRepository repository;
	
	public EntregaPedido salvaPedido(PedidoEntregaResponse response) {
		EntregaPedido entrega = new EntregaPedido(response);
		repository.save(entrega);
		return entrega;
	}
	
	public CodigoRastreioDto geraCodigoRastreio(PedidoEntregaResponse response) {
		EntregaPedido entrega = salvaPedido(response);
		entrega.setCodRastreio();
		CodigoRastreioDto rastreio = new CodigoRastreioDto(entrega.getPrevisaoParaEntrega(),entrega.getCodRastreio());
		repository.save(entrega);
		return rastreio;
		
	}

}
