package com.clientes.clientes.controller;

import com.clientes.clientes.model.FormatoSk;
import com.clientes.clientes.model.FormatoTh;
import com.clientes.clientes.service.FormatoSkService;
import com.clientes.clientes.service.FormatoThService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/formatoSk")
public class FormatoSkController {
    @Autowired
    private FormatoSkService formatoSkService;

    @GetMapping
    public ResponseEntity<List<FormatoSk>> findAll(){
        formatoSkService.cargarXML();
        return ResponseEntity.ok(formatoSkService.findAll());
    }

    @PostMapping
    public ResponseEntity<FormatoSk> create(@Valid @RequestBody FormatoSk formatoSk){
        return new ResponseEntity<>(formatoSkService.create(formatoSk), HttpStatus.CREATED);
    }

}
