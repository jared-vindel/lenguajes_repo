package com.example.examen.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.examen.services.TipoClienteService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.examen.entities.TipoCliente;
import com.example.examen.entities.Vehiculo;
import com.example.examen.services.VehiculoService;


@RestController
@RequestMapping("/vehiculo")
public class VehiculoController {

  @Autowired
  private VehiculoService vehiculoService;

  @PostMapping("/crear")
  public Vehiculo crearVehiculo(@RequestBody Vehiculo vehiculo) {
      //TODO: process POST request
      
      return this.vehiculoService.crearVehiculo(vehiculo);
  }
  

}
