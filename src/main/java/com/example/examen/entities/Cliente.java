package com.example.examen.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="cliente")
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="idcliente")
  private int idCliente;

  private String nombre;

  private String apellido;
  
  @Column(name="fechaingreso")
  private LocalDate fechaIngreso;

  @ManyToOne
  @JoinColumn(name="idtipocliente", referencedColumnName="idtipocliente")
  private TipoCliente tipoCliente;

}
