package br.com.lecom.rodrigo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lecom.rodrigo.Dto.PedidoDto;
import br.com.lecom.rodrigo.Dto.PedidoEntregaDto;
import br.com.lecom.rodrigo.model.Pedido;
import br.com.lecom.rodrigo.model.PedidoState;
import br.com.lecom.rodrigo.proxy.TransportadoraProxy;
import br.com.lecom.rodrigo.repostory.PedidoRepostory;
import br.com.lecom.rodrigo.response.CodRastreioResponse;

@Service
public class PedidoService {
	@Autowired
	private TransportadoraProxy proxy;
	@Autowired
	private PedidoRepostory pedidoRepostory;
	
	
	
	public Pedido fluxoPedido(PedidoDto pedidoDto) {
		Pedido pedido = recebePedido(pedidoDto);
		enviaTransportador(pedido);
		return pedido;
	}

	private void enviaTransportador(Pedido pedido) {
		PedidoEntregaDto pedidoEntregaDto = new PedidoEntregaDto(pedido);
		CodRastreioResponse rastreioResponse = proxy.enviaPostagem(pedidoEntregaDto);
		pedido.setCodigoRastreio(rastreioResponse.getCodigoRastreio());
		pedido.setPrevisaoEntrega(rastreioResponse.getPrevisaoParaEntrega());
		pedido.setStatus(PedidoState.ENCAMINHADO_A_TRANSPORTADORA);
		pedidoRepostory.save(pedido);
	}

	private Pedido recebePedido(PedidoDto pedidoDto) {
		Pedido pedido = new Pedido(pedidoDto);
		pedido.setStatus(PedidoState.RECEBIDO);
		pedidoRepostory.save(pedido);
		return pedido;	
	}

	public Optional<Pedido> findId(long id) {
		
		return pedidoRepostory.findById(id);
	}

	public List<Pedido> findAll() {
	
		return (List<Pedido>) pedidoRepostory.findAll();
	}

}
