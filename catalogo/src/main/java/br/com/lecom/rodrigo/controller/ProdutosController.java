package br.com.lecom.rodrigo.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lecom.rodrigo.dto.ProdutoDto;

@RestController
@RequestMapping("/catalogo")
public class ProdutosController {
	@GetMapping
	public List<ProdutoDto> findAll () {
		List<ProdutoDto> produtos = new ArrayList<ProdutoDto>();
		for (int i = 0; i < 8; i++) {
			ProdutoDto produto = MockProduto(i);
			produtos.add(produto);
		}
		
		return produtos ;
		
	}

	private ProdutoDto MockProduto(int i) {
		ProdutoDto produto = new ProdutoDto();
		produto.setId((long) i);
		produto.setNomeProduto("Produto "+ i);
		produto.setPrecoUnitario(BigDecimal.TEN);
		return produto;
	}
	

}
