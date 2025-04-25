package com.example.examen.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examen.entities.TipoCliente;
import com.example.examen.repositories.TipoClienteRepository;

@Service
public class TipoClienteService {

  @Autowired
  private TipoClienteRepository tipoClienteRepository;

  public TipoCliente crearTipoCliente(TipoCliente tipoCliente){
    TipoCliente newTipoCliente = new TipoCliente();

    newTipoCliente.setDescripcion(tipoCliente.getDescripcion());

    return this.tipoClienteRepository.save(newTipoCliente);
    
  }
}
