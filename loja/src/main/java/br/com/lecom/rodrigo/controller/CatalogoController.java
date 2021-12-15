package br.com.lecom.rodrigo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lecom.rodrigo.response.ProdutoResponse;
import br.com.lecom.rodrigo.service.CatalogoService;

@RestController
@RequestMapping("/produtos")
public class CatalogoController {
	@Autowired
	private CatalogoService catalogoService;
	
	@GetMapping
	public List<ProdutoResponse> findCatalogo(){
		List<ProdutoResponse> produtos = new ArrayList<>();
		produtos = catalogoService.findAll();
		return produtos;
		
	}
	
}
