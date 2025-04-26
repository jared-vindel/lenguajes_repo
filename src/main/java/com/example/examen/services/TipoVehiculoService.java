package com.example.examen.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examen.entities.TipoVehiculo;
import com.example.examen.repositories.TipoVehiculoRepository;

@Service
public class TipoVehiculoService {

  @Autowired
  private TipoVehiculoRepository tipoVehiculoRepository;

  public TipoVehiculo crearTipoVehiculo(TipoVehiculo tipoVehiculo){

    TipoVehiculo newTipoVehiculo = new TipoVehiculo();
    newTipoVehiculo.setDescripcion(tipoVehiculo.getDescripcion());
    newTipoVehiculo.setPrecioXHora(tipoVehiculo.getPrecioXHora());

    return this.tipoVehiculoRepository.save(newTipoVehiculo);
  }
}
