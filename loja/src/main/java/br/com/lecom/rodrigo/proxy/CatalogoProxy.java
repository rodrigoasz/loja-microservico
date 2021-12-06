package br.com.lecom.rodrigo.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.lecom.rodrigo.response.Produto;

@FeignClient(name = "catalogo", url = "localhost:8080")
public interface CatalogoProxy {
	@GetMapping(value = "/catalogo")
	public List<Produto> findAll();
}
