package br.com.lecom.rodrigo.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.lecom.rodrigo.Dto.PedidoEntregaDto;
import br.com.lecom.rodrigo.response.CodRastreioResponse;

@FeignClient(name = "transportadora", url = "localhost:8000")
public interface TransportadoraProxy {
	@PostMapping(value = "/entrega")
	public CodRastreioResponse enviaPostagem(@RequestBody PedidoEntregaDto response);

}
