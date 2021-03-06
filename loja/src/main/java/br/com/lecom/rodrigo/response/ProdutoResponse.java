package br.com.lecom.rodrigo.response;

import java.math.BigDecimal;

public class ProdutoResponse {
	private Long id;
	private String nomeProduto;
	private BigDecimal precoUnitario;
	
	public ProdutoResponse() {}
	public ProdutoResponse(Long id, String nomeProduto, BigDecimal precoUnitario) {
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
	@Override
	public String toString() {
		return "Produto [id=" + id + ", nomeProduto=" + nomeProduto + ", precoUnitario=" + precoUnitario + "]";
	}
	
	
	
}
