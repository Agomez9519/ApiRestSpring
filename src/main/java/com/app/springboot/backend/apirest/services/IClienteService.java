package com.app.springboot.backend.apirest.services;

import java.util.List;

import com.app.springboot.backend.apirest.models.entity.Cliente;

public interface IClienteService {

	List<Cliente> findAll();
}
