package com.bolsadetrabajo.springboot.backend.apirest.service;

import java.util.List;

import com.bolsadetrabajo.springboot.backend.apirest.entity.Cliente;

public interface IClienteService {

	public List<Cliente> findAll();
	public Cliente save(Cliente cliente);
	public Cliente findById(Long id);
	public void delete(Long id);
	
}
