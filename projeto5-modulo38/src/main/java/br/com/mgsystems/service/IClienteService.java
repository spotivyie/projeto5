package br.com.mgsystems.service;

import java.util.List;

import br.com.mgsystems.domain.Cliente;
import br.com.mgsystems.exceptions.DAOException;
import br.com.mgsystems.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

	List<Cliente> filtrarClientes(String query);

}
