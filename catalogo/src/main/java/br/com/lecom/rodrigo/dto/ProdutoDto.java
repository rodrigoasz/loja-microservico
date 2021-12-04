package br.com.lecom.rodrigo.dto;

import java.math.BigDecimal;

public class ProdutoDto {
	private Long id;
	private String nomeProduto;
	private BigDecimal precoUnitario;
	
	public ProdutoDto() {}
	public ProdutoDto(Long id, String nomeProduto, BigDecimal precoUnitario) {
		super();
		this.id = id;
		this.nomeProduto = nomeProduto;
		this.precoUnitario = precoUnitario;
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
