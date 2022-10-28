package com.clientes.clientes.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.clientes.clientes.model.Cliente;
import com.clientes.clientes.repository.IClienteRepository;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService implements IClienteService {
    @Autowired
    private IClienteRepository clienteRepo;

    @Override
    public List<Cliente> findAll() {
        return clienteRepo.findAll();
    }

    @Override
    public Optional<Cliente> findById(Integer id) {
        return clienteRepo.findById(id);
    }

    @Override
    public Cliente create(Cliente cliente) {
        return clienteRepo.save(cliente);
    }

    @Override
    public Cliente update(Cliente cliente) {
        return clienteRepo.save(cliente);
    }

    @Override
    public void delete(Integer id) {
        clienteRepo.deleteById(id);
    }
}

