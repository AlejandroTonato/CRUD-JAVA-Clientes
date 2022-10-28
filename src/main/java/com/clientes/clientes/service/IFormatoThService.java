package com.clientes.clientes.service;

import com.clientes.clientes.model.FormatoTh;

import java.util.List;

public interface IFormatoThService {

    List<FormatoTh> findAll();

    FormatoTh create(FormatoTh formatoTh);

    void cargarJson();
}
