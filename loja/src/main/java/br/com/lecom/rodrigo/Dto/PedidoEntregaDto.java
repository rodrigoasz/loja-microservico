package br.com.lecom.rodrigo.Dto;

import br.com.lecom.rodrigo.model.Pedido;

public class PedidoEntregaDto {
	private Long id;
	private String enderecoDestinatario;
	private String enderecoRemetente;
	
	public PedidoEntregaDto(Pedido pedido) {
		this.id = pedido.getId();
		this.enderecoRemetente = pedido.getEnderecoRemetente();
		this.enderecoDestinatario = pedido.getEnderecoDestinatario();
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

	
}
