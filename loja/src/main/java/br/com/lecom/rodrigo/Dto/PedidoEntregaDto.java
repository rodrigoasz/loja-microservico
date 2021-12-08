package br.com.lecom.rodrigo.Dto;

import br.com.lecom.rodrigo.model.Endereco;
import br.com.lecom.rodrigo.model.Pedido;

public class PedidoEntregaDto {
	private Long id;
	private Endereco enderecoDestinatario;
	private Endereco enderecoRemetente;
	
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
	
}
