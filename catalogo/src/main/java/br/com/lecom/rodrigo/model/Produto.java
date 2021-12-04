package br.com.lecom.rodrigo.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class Produto implements Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
	private String nomeProduto;
	private String categoria;
	private BigDecimal precoUnitario;
	
	public Produto() {}

	public Produto(long id, String nomeProduto , String categoria, BigDecimal precoUnitario) {
		super();
		this.id = id;
		this.nomeProduto = nomeProduto;
		this.categoria = categoria;
		this.precoUnitario = precoUnitario;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public BigDecimal getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(BigDecimal precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(categoria, id, precoUnitario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(categoria, other.categoria) && id == other.id
				&& Objects.equals(precoUnitario, other.precoUnitario);
	}
	
	
}
