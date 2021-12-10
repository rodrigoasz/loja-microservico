package br.com.lecom.rodrigo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lecom.rodrigo.Dto.PedidoDto;
import br.com.lecom.rodrigo.Dto.PedidoEntregaDto;
import br.com.lecom.rodrigo.model.Pedido;
import br.com.lecom.rodrigo.proxy.TransportadoraProxy;
import br.com.lecom.rodrigo.repostory.PedidoRepostory;
import br.com.lecom.rodrigo.response.CodRastreioResponse;

@Service
public class PedidoService {
	@Autowired
	private TransportadoraProxy proxy;
	@Autowired
	private PedidoRepostory pedidoRepostory;
	
	public Pedido realizaPedido(PedidoDto pedidoDto) {
	
		
		Pedido pedido = new Pedido(pedidoDto);
		pedidoRepostory.save(pedido);
		System.out.println(pedido);
		PedidoEntregaDto pedidoEntregaDto = new PedidoEntregaDto(pedido);
		CodRastreioResponse rastreioResponse = proxy.enviaPostagem(pedidoEntregaDto);
		pedido.setCodigoRastreio(rastreioResponse.getCodigoRastreio());
		pedido.setPrevisaoEntrega(rastreioResponse.getPrevisaoParaEntrega());
		pedidoRepostory.save(pedido);
		return pedido;
	}

}
