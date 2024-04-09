package br.com.mgsystems.service;

import java.util.List;

import br.com.mgsystems.domain.Produto;
import br.com.mgsystems.services.generic.IGenericService;

public interface IProdutoService extends IGenericService<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}
