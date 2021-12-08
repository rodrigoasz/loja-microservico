package br.com.lecom.rodrigo.response;

import br.com.lecom.rodrigo.model.Endereco;

public class PedidoEntregaResponse {
	private Long pedidoId;
	private Endereco enderecoRemetente;
	private Endereco enderecoDestinatario;
	
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
	
	
}
