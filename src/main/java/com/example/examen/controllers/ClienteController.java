package com.example.examen.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.examen.services.TipoClienteService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.examen.entities.Cliente;
import com.example.examen.entities.TipoCliente;
import com.example.examen.entities.Vehiculo;
import com.example.examen.services.ClienteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/clientes")
public class ClienteController {

  @Autowired
  private ClienteService clienteService;

  @PostMapping("/crear")
  public Cliente crearCliente(@RequestBody Cliente cliente) {
      //TODO: process POST request
      
      return this.clienteService.crearCliente(cliente);
  }

  @GetMapping("/todos")
  public List<Cliente> obtenerTodos() {
      return this.clienteService.obtenerTodos();
  }

  @GetMapping("/obtener/{id}")
  public Cliente obtenerPorId(@PathVariable int id) {
      return this.clienteService.obtenerPorId(id);
  }
  
  
}
