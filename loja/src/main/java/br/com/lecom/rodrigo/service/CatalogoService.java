package br.com.lecom.rodrigo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lecom.rodrigo.proxy.CatalogoProxy;
import br.com.lecom.rodrigo.response.ProdutoResponse;

@Service
public class CatalogoService {
	@Autowired
	private CatalogoProxy catalogoProxy;

	public List<ProdutoResponse> findAll() {
		return catalogoProxy.findAll();
	}
}
