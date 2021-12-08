package br.com.lecom.rodrigo.response;

import java.time.LocalDate;

public class CodRastreioResponse {
	private LocalDate previsaoParaEntrega;
	private String codigoRastreio;
	
	public LocalDate getPrevisaoParaEntrega() {
		return previsaoParaEntrega;
	}
	public void setPrevisaoParaEntrega(LocalDate previsaoParaEntrega) {
		this.previsaoParaEntrega = previsaoParaEntrega;
	}
	public String getCodigoRastreio() {
		return codigoRastreio;
	}
	public void setCodigoRastreio(String codigoRastreio) {
		this.codigoRastreio = codigoRastreio;
	}
}
