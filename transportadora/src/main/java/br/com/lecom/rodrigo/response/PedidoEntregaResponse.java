package br.com.lecom.rodrigo.response;

public class PedidoEntregaResponse {
	private Long id;
	private String enderecoRemetente;
	private String enderecoDestinatario;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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

	
	
}
