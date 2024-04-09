package br.com.mgsystems.dao;

import java.util.List;

import br.com.mgsystems.dao.generic.IGenericDAO;
import br.com.mgsystems.domain.Cliente;

public interface IClienteDAO extends IGenericDAO<Cliente, Long>{

	List<Cliente> filtrarClientes(String query);

}
