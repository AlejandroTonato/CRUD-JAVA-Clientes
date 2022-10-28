package com.clientes.clientes.repository;

import com.clientes.clientes.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteRepository extends JpaRepository <Cliente,Integer> {
}
