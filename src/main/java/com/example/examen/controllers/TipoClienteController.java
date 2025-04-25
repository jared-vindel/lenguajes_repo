package com.example.examen.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.examen.services.TipoClienteService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.examen.entities.TipoCliente;


@RestController
@RequestMapping("/tipocliente")
public class TipoClienteController {

  @Autowired
  private TipoClienteService tipoClienteService;

  @PostMapping("/crear")
  public TipoCliente crearTipoCliente(@RequestBody TipoCliente tipoCliente) {
      //TODO: process POST request
      
      return this.tipoClienteService.crearTipoCliente(tipoCliente);
  }
  
}
