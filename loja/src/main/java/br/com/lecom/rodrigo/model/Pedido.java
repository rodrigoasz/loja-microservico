package br.com.lecom.rodrigo.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import br.com.lecom.rodrigo.Dto.PedidoDto;

@Entity
public class Pedido{

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToMany//(cascade = CascadeType.ALL)
	@JoinColumn(name = "pedido_id")
	private List<Produto> produtos;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "pedido_id")
//	private Endereco enderecoDestinatario;
	private String enderecoDestinatario;
	private BigDecimal valor;
	private String codigoRastreio;
	private LocalDate previsaoEntrega;

	public Pedido() {
	}

	public Pedido(PedidoDto pedidoDto) {

		
		this.produtos = pedidoDto.getProdutos();
		calculaValor(produtos);

		this.enderecoDestinatario = pedidoDto.getEnderecoDestinatario().toString();

	}

//	public Pedido(Long id, List<Produto> produtos, Endereco enderecoDestinatario, BigDecimal valor,
//			String codigoRastreio) {
//		super();
//		this.id = id;
//		this.produtos = produtos;
//		this.enderecoDestinatario = enderecoDestinatario;
//		this.valor = valor;
//		this.codigoRastreio = codigoRastreio;
//	}


	public void calculaValor(List<Produto> produtos) {
		this.valor = new BigDecimal(0);
		produtos.forEach(produto -> this.valor = this.valor
				.add(BigDecimal.valueOf(produto.getQuantidade()).multiply(produto.getPrecoUnitario())));

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public String getEnderecoDestinatario() {
		return enderecoDestinatario;
	}

	public void setEnderecoDestinatario(String enderecoDestinatario) {
		this.enderecoDestinatario = enderecoDestinatario;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getCodigoRastreio() {
		return codigoRastreio;
	}

	public void setCodigoRastreio(String codigoRastreio) {
		this.codigoRastreio = codigoRastreio;
	}

	public LocalDate getPrevisaoEntrega() {
		return previsaoEntrega;
	}

	public void setPrevisaoEntrega(LocalDate previsaoEntrega) {
		this.previsaoEntrega = previsaoEntrega;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", produtos=" + produtos + ", enderecoDestinatario=" + enderecoDestinatario
				+ ", valor=" + valor + ", codigoRastreio=" + codigoRastreio + ", previsaoEntrega=" + previsaoEntrega
				+ "]";
	}



}
