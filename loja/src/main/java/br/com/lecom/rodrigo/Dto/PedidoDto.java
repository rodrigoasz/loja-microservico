package br.com.lecom.rodrigo.Dto;

import java.util.List;

import br.com.lecom.rodrigo.model.Endereco;
import br.com.lecom.rodrigo.model.Produto;

public class PedidoDto {
	
	private List<Produto> produtos;
	private Endereco enderecoDestinatario;
	
	public PedidoDto() {}
	public PedidoDto(List<Produto> produtos, Endereco enderecoDestinatario) {
		this.produtos = produtos;
		this.enderecoDestinatario = enderecoDestinatario;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	public Endereco getEnderecoDestinatario() {
		return enderecoDestinatario;
	}
	public void setEnderecoDestinatario(Endereco enderecoDestinatario) {
		this.enderecoDestinatario = enderecoDestinatario;
	}
	
	
	
}
