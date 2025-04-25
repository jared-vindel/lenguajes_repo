package com.example.examen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.examen.entities.TipoCliente;

@Repository
public interface TipoClienteRepository extends JpaRepository<TipoCliente, Integer> {

}
