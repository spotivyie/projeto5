package br.com.mgsystems.dao;

import java.util.List;

import br.com.mgsystems.dao.generic.IGenericDAO;
import br.com.mgsystems.domain.Produto;

public interface IProdutoDAO extends IGenericDAO<Produto, String>{

	List<Produto> filtrarProdutos(String query);

}
