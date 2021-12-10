package br.com.lecom.rodrigo.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.lecom.rodrigo.response.PedidoEntregaResponse;

@Entity
public class EntregaPedido {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;	
	private Long pedidoId;
	private String enderecoRemetente;
	private String enderecoDestinatario;
	private LocalDate previsaoParaEntrega;
	private String codigoRastreio;
	
	public EntregaPedido(PedidoEntregaResponse response) {
	
		this.pedidoId = response.getId();
		this.enderecoRemetente = response.getEnderecoRemetente();
		this.enderecoDestinatario = response.getEnderecoDestinatario();
		
		
	}
	public Long getId() {
		return id;
	}
	public Long getPedidoId() {
		return pedidoId;
	}
	public void setPedidoId(Long pedidoId) {
		this.pedidoId = pedidoId;
	}
	public String getEnderecoRemetente() {
		return enderecoRemetente;
	}
	public void setEnderecoRemetente(String enderecoRemetente) {
		this.enderecoRemetente = enderecoRemetente;
	}
	public String getEnderecoDestinatario() {
		return enderecoDestinatario;
	}
	public void setEnderecoDestinatario(String enderecoDestinatario) {
		this.enderecoDestinatario = enderecoDestinatario;
	}
	public LocalDate getPrevisaoParaEntrega() {
		return previsaoParaEntrega;
	}
	public String getCodRastreio() {
		return codigoRastreio;
	}
	public void setCodRastreio() {
		this.previsaoParaEntrega = LocalDate.now().plusDays(3l);
		this.codigoRastreio = "BR"+ id;
	}
	
	
	
}
