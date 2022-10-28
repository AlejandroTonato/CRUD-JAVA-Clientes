package com.clientes.clientes.service;

import com.clientes.clientes.model.Cliente;

import java.util.List;
import java.util.Optional;

public interface IClienteService {

    List<Cliente> findAll(); //listar cliente;

    Optional<Cliente> findById(Integer id); //Consulta un cliente
    Cliente create(Cliente cliente); // crear

    Cliente update(Cliente cliente); // Actualizar

    void delete (Integer id); // Eliminar

}
