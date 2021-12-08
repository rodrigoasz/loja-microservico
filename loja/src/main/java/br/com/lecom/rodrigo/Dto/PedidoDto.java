package br.com.lecom.rodrigo.Dto;

import java.util.List;

import br.com.lecom.rodrigo.model.Endereco;
import br.com.lecom.rodrigo.response.ProdutoResponse;

public class PedidoDto {
	
	private Long id;
	private List<ProdutoResponse> produtos;
	private Endereco enderecoDestinatario;
	
	public PedidoDto() {}
	public PedidoDto(Long id, List<ProdutoResponse> produtos, Endereco enderecoDestinatario) {
		super();
		this.id = id;
		this.produtos = produtos;
		this.enderecoDestinatario = enderecoDestinatario;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<ProdutoResponse> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<ProdutoResponse> produtos) {
		this.produtos = produtos;
	}
	public Endereco getEnderecoDestinatario() {
		return enderecoDestinatario;
	}
	public void setEnderecoDestinatario(Endereco enderecoDestinatario) {
		this.enderecoDestinatario = enderecoDestinatario;
	}
	
	
	
}
