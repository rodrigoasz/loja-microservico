package br.com.lecom.rodrigo.model;

import java.time.LocalDate;

import br.com.lecom.rodrigo.response.PedidoEntregaResponse;

public class EntregaPedido {
	private static Long id = 0l;
	//private Long id;	
	private Long pedidoId;
	private Endereco enderecoRemetente;
	private Endereco enderecoDestinatario;
	private LocalDate previsaoParaEntrega;
	private String codigoRastreio;
	
	public EntregaPedido(PedidoEntregaResponse response) {
		id++;
		this.pedidoId = response.getPedidoId();
		this.enderecoRemetente = response.getEnderecoRemetente();
		this.enderecoDestinatario = response.getEnderecoDestinatario();
		this.previsaoParaEntrega = LocalDate.now().plusDays(3l);
		this.codigoRastreio = "BR"+ id;
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getPedidoId() {
		return pedidoId;
	}
	public void setPedidoId(Long pedidoId) {
		this.pedidoId = pedidoId;
	}
	public Endereco getEnderecoRemetente() {
		return enderecoRemetente;
	}
	public void setEnderecoRemetente(Endereco enderecoRemetente) {
		this.enderecoRemetente = enderecoRemetente;
	}
	public Endereco getEnderecoDestinatario() {
		return enderecoDestinatario;
	}
	public void setEnderecoDestinatario(Endereco enderecoDestinatario) {
		this.enderecoDestinatario = enderecoDestinatario;
	}
	public LocalDate getPrevisaoParaEntrega() {
		return previsaoParaEntrega;
	}
	public void setPrevisaoParaEntrega(LocalDate previsaoParaEntrega) {
		this.previsaoParaEntrega = previsaoParaEntrega;
	}
	public String getCodRastreio() {
		return codigoRastreio;
	}
	public void setCodRastreio(String codRastreio) {
		this.codigoRastreio = codRastreio;
	}
	
	
	
}
