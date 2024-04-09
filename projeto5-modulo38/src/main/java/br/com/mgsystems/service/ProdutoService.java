package br.com.mgsystems.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.mgsystems.dao.IProdutoDAO;
import br.com.mgsystems.domain.Produto;
import br.com.mgsystems.services.generic.GenericService;

@Stateless
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {
	
	private IProdutoDAO produtoDao;

	@Inject
	public ProdutoService(IProdutoDAO produtoDao) {
		super(produtoDao);
		this.produtoDao = produtoDao;
	}

	@Override
	public List<Produto> filtrarProdutos(String query) {
		return produtoDao.filtrarProdutos(query);
	}

}
