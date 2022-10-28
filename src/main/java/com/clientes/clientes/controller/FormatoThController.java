package com.clientes.clientes.controller;

import com.clientes.clientes.model.FormatoTh;
import com.clientes.clientes.service.FormatoThService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/formatoTh")
public class FormatoThController {
    @Autowired
    private FormatoThService formatoThService;

    @GetMapping
    public ResponseEntity<List<FormatoTh>> findAll(){
        formatoThService.cargarJson();
        return ResponseEntity.ok(formatoThService.findAll());
    }

    @PostMapping
    public ResponseEntity<FormatoTh> create(@Valid @RequestBody FormatoTh formatoTh){
        return new ResponseEntity<>(formatoThService.create(formatoTh), HttpStatus.CREATED);
    }


}
