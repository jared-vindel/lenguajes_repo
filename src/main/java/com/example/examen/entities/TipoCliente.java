package com.example.examen.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="tipocliente")
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TipoCliente {
  
  @Id
  @Column(name="idtipocliente")
  @GeneratedValue(strategy=GenerationType.IDENTITY) 
  private int idTipoCliente;

  private String descripcion;
}
