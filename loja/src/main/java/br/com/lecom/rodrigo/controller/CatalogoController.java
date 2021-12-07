package br.com.lecom.rodrigo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lecom.rodrigo.proxy.CatalogoProxy;
import br.com.lecom.rodrigo.response.Produto;

@RestController
@RequestMapping("/produtos")
public class CatalogoController {
	@Autowired
	private CatalogoProxy catalogoProxy;
	
	@GetMapping
	public List<Produto> findCatalogo(){
		List<Produto> produtos = new ArrayList<>();
		produtos = catalogoProxy.findAll();
		return produtos;
		
	}
	
	
}
