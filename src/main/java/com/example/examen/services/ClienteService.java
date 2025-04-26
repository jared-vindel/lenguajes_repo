package com.example.examen.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examen.entities.Cliente;
import com.example.examen.entities.TipoCliente;
import com.example.examen.entities.Vehiculo;
import com.example.examen.repositories.ClienteRepository;
import com.example.examen.repositories.TipoClienteRepository;

@Service
public class ClienteService {

  @Autowired
  private ClienteRepository clienteRepository;

  @Autowired
  private TipoClienteRepository tipoClienteRepository;

  public Cliente crearCliente(Cliente cliente){

    TipoCliente tipoCliente = new TipoCliente();
    Cliente newCliente = new Cliente();
    List<Cliente> clientes = new ArrayList<>();

    tipoCliente.setDescripcion(cliente.getTipoCliente().getDescripcion());

    //cliente
    newCliente.setNombre(cliente.getNombre());
    newCliente.setApellido(cliente.getApellido());
    newCliente.setFechaIngreso(cliente.getFechaIngreso());
    newCliente.setTipoCliente(tipoCliente);
    
    clientes.add(newCliente);

    tipoCliente.setClientes(clientes);
    this.tipoClienteRepository.save(tipoCliente);

    return this.clienteRepository.save(newCliente);

  }

  public List<Cliente> obtenerTodos(){

    return this.clienteRepository.findAll();
  }

   public Cliente obtenerPorId(int id){

    if(this.clienteRepository.existsById(id)){
      return this.clienteRepository.findById(id).get();
    } else {
      return null;
    }
  }
}
