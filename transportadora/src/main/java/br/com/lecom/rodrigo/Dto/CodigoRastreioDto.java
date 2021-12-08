package br.com.lecom.rodrigo.Dto;

import java.time.LocalDate;

public class CodigoRastreioDto {
	private LocalDate previsaoParaEntrega;
	private String codigoRastreio;
	
	public CodigoRastreioDto(LocalDate previsao, String codRastreio) {
		this.previsaoParaEntrega = previsao;
		this.codigoRastreio = codRastreio;
	}
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
