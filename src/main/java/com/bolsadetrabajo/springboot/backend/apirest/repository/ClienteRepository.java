package com.bolsadetrabajo.springboot.backend.apirest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bolsadetrabajo.springboot.backend.apirest.entity.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long>{

}
