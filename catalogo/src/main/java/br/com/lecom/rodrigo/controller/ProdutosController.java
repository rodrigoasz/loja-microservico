package br.com.lecom.rodrigo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lecom.rodrigo.dto.ProdutoDto;
import br.com.lecom.rodrigo.model.Produto;
import br.com.lecom.rodrigo.service.ProdutoService;

@RestController
@RequestMapping("/catalogo")
public class ProdutosController {
	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping
	public List<ProdutoDto> findAll () {
		List<Produto> produtos = produtoService.buscaProdutos();
		return produtoService.criarProdutosDto(produtos);
		
	}
}
