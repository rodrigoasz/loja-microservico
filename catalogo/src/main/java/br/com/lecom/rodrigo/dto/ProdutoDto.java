package br.com.lecom.rodrigo.dto;

import java.math.BigDecimal;

import br.com.lecom.rodrigo.model.Produto;

public class ProdutoDto {
	private Long id;
	private String nomeProduto;
	private BigDecimal precoUnitario;
	
	public ProdutoDto() {}
	public ProdutoDto(Produto produto) {
		super();
		this.id = produto.getId();
		this.nomeProduto = produto.getNomeProduto();
		this.precoUnitario = produto.getPrecoUnitario();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public BigDecimal getPrecoUnitario() {
		return precoUnitario;
	}
	public void setPrecoUnitario(BigDecimal precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	
	
	
}
