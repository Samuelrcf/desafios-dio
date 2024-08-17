package com.samuelr.demo.services;

import com.samuelr.demo.model.entities.Cliente;

public interface ClienteService {
	Iterable<Cliente> buscarTodos();

	Cliente buscarPorId(Long id);

	void inserir(Cliente cliente);

	void atualizar(Long id, Cliente cliente);

	void deletar(Long id);
}
