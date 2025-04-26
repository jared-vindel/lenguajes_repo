package com.example.examen.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.examen.services.TipoClienteService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.examen.entities.TipoCliente;
import com.example.examen.entities.Vehiculo;
import com.example.examen.services.VehiculoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/vehiculos")
public class VehiculoController {

  @Autowired
  private VehiculoService vehiculoService;

  @PostMapping("/crear")
  public Vehiculo crearVehiculo(@RequestBody Vehiculo vehiculo) {
      //TODO: process POST request
      
      return this.vehiculoService.crearVehiculo(vehiculo);
  }

  @GetMapping("/obtener/todos")
  public List<Vehiculo> obtenerTodos() {
      return this.vehiculoService.obtenerTodos();
  }
  
  

}
