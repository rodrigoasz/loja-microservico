package br.com.lecom.rodrigo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lecom.rodrigo.Dto.PedidoDto;
import br.com.lecom.rodrigo.Dto.PedidoEntregaDto;
import br.com.lecom.rodrigo.model.Loja;
import br.com.lecom.rodrigo.model.Pedido;
import br.com.lecom.rodrigo.proxy.TransportadoraProxy;
import br.com.lecom.rodrigo.repository.PedidoRepository;
import br.com.lecom.rodrigo.response.CodRastreioResponse;

@Service
public class PedidoService {
	@Autowired
	private PedidoRepository pedidoRepository;
	@Autowired
	private TransportadoraProxy proxy;

	public Pedido realizaPedido(PedidoDto pedidoDto) {
		Pedido pedido = new Pedido(pedidoDto);
		pedidoRepository.save(pedido);
		PedidoEntregaDto pedidoEntregaDto = new PedidoEntregaDto(pedido,Loja.LOJA_ENDERECO);
		System.out.println(pedidoEntregaDto);
		
		
		CodRastreioResponse rastreioResponse = proxy.enviaPostagem(pedidoEntregaDto);
		pedido.setCodigoRastreio(rastreioResponse.getCodigoRastreio());
		pedido.setPrevisaoEntrega(rastreioResponse.getPrevisaoParaEntrega());
		pedidoRepository.save(pedido);
		return pedido;
	}
	
}
