package br.com.lecom.rodrigo.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Endereco implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String endereco;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	
	public Endereco() {}
	
	public Endereco(String endereco, String bairro, String cidade, String estado, String cep) {
		super();
		this.endereco = endereco;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bairro, cep, cidade, endereco, estado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		return Objects.equals(bairro, other.bairro) && Objects.equals(cep, other.cep)
				&& Objects.equals(cidade, other.cidade) && Objects.equals(endereco, other.endereco)
				&& Objects.equals(estado, other.estado);
	}
	
	@Override
	public String toString() {
		return (endereco +" - "+ bairro + ". "+ cidade + " - "+ estado + ". CEP: "+ cep);
	}
	
	
	
	
	

}
