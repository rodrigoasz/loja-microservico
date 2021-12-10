package br.com.lecom.rodrigo.response;

import br.com.lecom.rodrigo.model.Endereco;

public class PedidoEntregaResponse {
	private Long id;
	private Endereco enderecoRemetente;
	private Endereco enderecoDestinatario;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
