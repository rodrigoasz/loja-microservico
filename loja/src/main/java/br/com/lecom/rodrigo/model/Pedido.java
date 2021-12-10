package br.com.lecom.rodrigo.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import br.com.lecom.rodrigo.Dto.PedidoDto;

@Entity
public class Pedido implements Serializable {

	private static final long serialVersionUID = 1L;
	//private static Long contador=0l;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "pedidoId")
	private List<Produto> produtos;
	
	private String enderecoDestinatario;
	
	private String enderecoRemetente;
	private BigDecimal valor;
	private String codigoRastreio;
	private LocalDate previsaoEntrega;

	public Pedido() {
	}

	public Pedido(PedidoDto pedidoDto) {

		//this.id = contador++;
		this.produtos = pedidoDto.getProdutos();
		calculaValor(produtos);
		this.enderecoDestinatario = pedidoDto.getEnderecoDestinatario().toString();
		this.enderecoRemetente = Loja.LOJA_ENDERECO.toString();

	}

	public Pedido(Long id, List<Produto> produtos, Endereco enderecoDestinatario, Endereco enderecoRemetente,
			BigDecimal valor, String codigoRastreio) {
		super();
		this.id = id;
		this.produtos = produtos;
		this.enderecoDestinatario = enderecoDestinatario.toString();
		this.enderecoRemetente = enderecoRemetente.toString();
		this.valor = valor;
		this.codigoRastreio = codigoRastreio;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public String getEnderecoDestinatario() {
		return enderecoDestinatario;
	}

	public void setEnderecoDestinatario(String enderecoDestinatario) {
		this.enderecoDestinatario = enderecoDestinatario;
	}

	public String getEnderecoRemetente() {
		return enderecoRemetente;
	}

	public void setEnderecoRemetente(String enderecoRemetente) {
		this.enderecoRemetente = enderecoRemetente;
	}

	public List<Produto> getProdutos() {
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
	

//	public void adicionaProduto(ProdutoResponse produto) {
//		this.produtos.add(produto);
//		this.valor.add(produto.getPrecoUnitario());
//	}

	public LocalDate getPrevisaoEntrega() {
		return previsaoEntrega;
	}

	public void setPrevisaoEntrega(LocalDate previsaoEntrega) {
		this.previsaoEntrega = previsaoEntrega;
	}

	public void calculaValor(List<Produto> produtos) {
		this.valor = new BigDecimal(0);
		produtos.forEach(produto -> this.valor=this.valor.add(produto.getPrecoUnitario()));
		
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", produtos=" + produtos + ", enderecoDestinatario=" + enderecoDestinatario
				+ ", enderecoRemetente=" + enderecoRemetente + ", valor=" + valor + ", codigoRastreio=" + codigoRastreio
				+ ", previsaoEntrega=" + previsaoEntrega + "]";
	}
	

}
