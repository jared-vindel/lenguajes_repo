package com.example.examen.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examen.entities.TipoVehiculo;
import com.example.examen.entities.Vehiculo;
import com.example.examen.repositories.TipoVehiculoRepository;
import com.example.examen.repositories.VehiculoRepository;

@Service
public class VehiculoService {

  @Autowired
  private VehiculoRepository vehiculoRepository;

  @Autowired
  private TipoVehiculoRepository tipoVehiculoRepository;

  public Vehiculo crearVehiculo(Vehiculo vehiculo){

    TipoVehiculo tipoVehiculo = new TipoVehiculo();
    Vehiculo newVehiculo = new Vehiculo();
    List<Vehiculo> vehiculos = new ArrayList<>();

    //tipovehiculo
    tipoVehiculo.setDescripcion(vehiculo.getTipoVehiculo().getDescripcion());
    tipoVehiculo.setPrecioXHora(vehiculo.getTipoVehiculo().getPrecioXHora());
    //this.tipoVehiculoRepository.save(tipoVehiculo);

    //vehiculo
    newVehiculo.setMarca(vehiculo.getMarca());
    newVehiculo.setDisponible(vehiculo.isDisponible()); //error
    newVehiculo.setAnio(vehiculo.getAnio());
    newVehiculo.setTipoVehiculo(tipoVehiculo);
    //this.vehiculoRepository.save(newVehiculo);
    vehiculos.add(newVehiculo);

    this.tipoVehiculoRepository.save(tipoVehiculo);
    tipoVehiculo.setVehiculos(vehiculos);

    return this.vehiculoRepository.save(newVehiculo);

  }

  public List<Vehiculo> obtenerTodos(){
    
    return this.vehiculoRepository.findAll();
  }

  public Vehiculo obtenerPorId(int id){

    if(this.vehiculoRepository.existsById(id)){
      return this.vehiculoRepository.findById(id).get();
    } else {
      return null;
    }
  }
}
