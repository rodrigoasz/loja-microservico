package br.com.lecom.rodrigo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lecom.rodrigo.dto.ProdutoDto;
import br.com.lecom.rodrigo.model.Produto;
import br.com.lecom.rodrigo.repository.ProdutoRepository;

@Service
public class ProdutoService {
	@Autowired
	private ProdutoRepository repository;

	public List<Produto> buscaProdutos() {
		return (List<Produto>) repository.findAll();
	}

	public List<ProdutoDto> criarProdutosDto(List<Produto> produtos) {
		List<ProdutoDto> produtosDTO = new ArrayList<>();
		produtos.forEach(produto -> {
			ProdutoDto produtoDto = new ProdutoDto(produto);
			produtosDTO.add(produtoDto);
		});
		return produtosDTO;
	}
}
