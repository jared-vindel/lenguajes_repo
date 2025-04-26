package com.example.examen.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.examen.services.TipoClienteService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.examen.entities.TipoCliente;
import com.example.examen.entities.TipoVehiculo;
import com.example.examen.services.TipoVehiculoService;


@RestController
@RequestMapping("/tipovehiculo")
public class TipoVehiculoController {

  @Autowired
  private TipoVehiculoService tipoVehiculoService;

  @PostMapping("/crear")
  public TipoVehiculo crearTipoVehiculo(@RequestBody TipoVehiculo tipoVehiculo) {
      //TODO: process POST request
      
      return this.tipoVehiculoService.crearTipoVehiculo(tipoVehiculo);
  }
  
}
