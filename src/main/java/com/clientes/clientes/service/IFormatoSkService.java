package com.clientes.clientes.service;

import com.clientes.clientes.model.FormatoSk;
import com.clientes.clientes.model.FormatoTh;
import com.clientes.clientes.repository.IFormatoThRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public interface IFormatoSkService {

    List<FormatoSk> findAll();
    FormatoSk create(FormatoSk formatoSk);

    void cargarXML();

}
