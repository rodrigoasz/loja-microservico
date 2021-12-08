package br.com.lecom.rodrigo.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import br.com.lecom.rodrigo.Dto.PedidoDto;
import br.com.lecom.rodrigo.response.ProdutoResponse;

public class Pedido implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private List<ProdutoResponse> produtos;
	private Endereco enderecoDestinatario;
	private Endereco enderecoRemetente;
	private BigDecimal valor;
	private String codigoRastreio;

	public Pedido() {
	}

	public Pedido(PedidoDto pedidoDto) {

		this.id = pedidoDto.getId();
		this.produtos = pedidoDto.getProdutos();
		calculaValor(produtos);

		this.enderecoDestinatario = pedidoDto.getEnderecoDestinatario();
		this.enderecoRemetente = Loja.LOJA_ENDERECO;

	}

	public Pedido(Long id, List<ProdutoResponse> produtos, Endereco enderecoDestinatario, Endereco enderecoRemetente,
			BigDecimal valor, String codigoRastreio) {
		super();
		this.id = id;
		this.produtos = produtos;
		this.enderecoDestinatario = enderecoDestinatario;
		this.enderecoRemetente = enderecoRemetente;
		this.valor = valor;
		this.codigoRastreio = codigoRastreio;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Endereco getEnderecoDestinatario() {
		return enderecoDestinatario;
	}

	public void setEnderecoDestinatario(Endereco enderecoDestinatario) {
		this.enderecoDestinatario = enderecoDestinatario;
	}

	public Endereco getEnderecoRemetente() {
		return enderecoRemetente;
	}

	public void setEnderecoRemetente(Endereco enderecoRemetente) {
		this.enderecoRemetente = enderecoRemetente;
	}

	public List<ProdutoResponse> getProdutos() {
		return produtos;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public String getCodigoRastreio() {
		return codigoRastreio;
	}

	public void setCodigoRastreio(String codigoRastreio) {
		this.codigoRastreio = codigoRastreio;
	}

	public void adicionaProduto(ProdutoResponse produto) {
		this.produtos.add(produto);
		this.valor.add(produto.getPrecoUnitario());
	}

	public void calculaValor(List<ProdutoResponse> produtos) {
		this.valor = new BigDecimal(0);
		produtos.forEach(produto -> this.valor=this.valor.add(produto.getPrecoUnitario()));
		
	}

}
