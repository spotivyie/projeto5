package br.com.mgsystems.service;

import br.com.mgsystems.dao.generic.IGenericDAO;
import br.com.mgsystems.domain.Venda;
import br.com.mgsystems.exceptions.DAOException;
import br.com.mgsystems.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaService extends IGenericDAO<Venda, Long>{

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public Venda consultarComCollection(Long id);

}
